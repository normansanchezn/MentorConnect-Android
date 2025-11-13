package com.accenture.data.mapper

import com.accenture.core.mapper.ResultMapper
import com.accenture.data.dto.AccentureUserDTO
import com.accenture.domain.model.accentureuser.AccentureUserModel
import javax.inject.Inject

class AccentureUserMapper @Inject constructor()
    : ResultMapper<List<AccentureUserDTO>, List<AccentureUserModel>> {
    override fun map(input: List<AccentureUserDTO>): List<AccentureUserModel> = input.filter {
        it.id != null && it.name != null
    }.map {
        it.toModel()
    }
    private fun AccentureUserDTO.toModel() = AccentureUserModel(
        capabilityLead = this.capabilityLead,
        createdAt = this.createdAt,
        email = this.email,
        gender = this.gender,
        id = this.id,
        image = this.image,
        initiativeLead = this.initiativeLead,
        jobDescription = this.jobDescription,
        jobTitle = this.jobTitle,
        jobType = this.jobType,
        lastName = this.lastName,
        name = this.name,
        peopleLead = this.peopleLead
    )
}