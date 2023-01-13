package com.appiwedia.apps.android.translator_kmm.translate.domain.translate

import com.appiwedia.apps.android.translator_kmm.core.domain.language.Language

interface TranslateClient {
    suspend fun translate(
        fromLanguage: Language,
        fromText: String,
        toLanguage: Language
    ): String
}