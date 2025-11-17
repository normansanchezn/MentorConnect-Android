package dev.normansanchez.designsystem.components.foundations.media.video

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.media3.common.MediaItem
import androidx.media3.common.Player
import androidx.media3.datasource.RawResourceDataSource
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.AspectRatioFrameLayout
import androidx.media3.ui.PlayerView
import dev.normansanchez.designsystem.components.foundations.media.video.model.DSVideoModel

/**
 * DSVideo
 *
 * @param: DSVideoModel
 * @see DSVideoModel
 *
 * @author: Normán Sánchez
 * @since: v1.0.0
 * @version: 1.0.0
 *
 * @sample dev.normansanchez.designsystem.components.previews.DSVideoExample
 */
@SuppressLint("UnsafeOptInUsageError")
@Composable
fun DSVideo(
    dsVideoModel: DSVideoModel
) {
    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current
    val playWhenReadyState by rememberUpdatedState(dsVideoModel.playWhenReady)

    val exoPlayer = remember(context, dsVideoModel.videoRawRes) {
        ExoPlayer
            .Builder(context)
            .build()
            .apply {
                val uri = RawResourceDataSource.buildRawResourceUri(dsVideoModel.videoRawRes)
                setMediaItem(MediaItem.fromUri(uri))
                repeatMode = Player.REPEAT_MODE_ALL
                volume = if (dsVideoModel.isMuted) 0f else 1f
                this.playWhenReady = playWhenReady
                prepare()
            }
    }

    DisposableEffect(lifecycleOwner, exoPlayer) {
        val observer = LifecycleEventObserver { _, event ->
            when (event) {
                Lifecycle.Event.ON_RESUME -> {
                    exoPlayer.playWhenReady = playWhenReadyState
                }

                Lifecycle.Event.ON_PAUSE -> {
                    exoPlayer.playWhenReady = false
                    exoPlayer.pause()
                }

                else -> Unit
            }
        }

        lifecycleOwner.lifecycle.addObserver(observer)
        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)
            exoPlayer.release()
        }
    }

    Box(
        modifier = dsVideoModel.modifier.fillMaxSize()
    ) {
        AndroidView(
            modifier = Modifier.matchParentSize(),
            factory = { ctx ->
                PlayerView(ctx).apply {
                    useController = false
                    player = exoPlayer
                    resizeMode = AspectRatioFrameLayout.RESIZE_MODE_ZOOM
                }
            },
            update = {
                it.player = exoPlayer
            }
        )
        dsVideoModel.content
    }
}
