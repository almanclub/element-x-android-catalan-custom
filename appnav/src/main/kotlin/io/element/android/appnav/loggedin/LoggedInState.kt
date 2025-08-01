/*
 * Copyright 2023, 2024 New Vector Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only OR LicenseRef-Element-Commercial
 * Please see LICENSE files in the repository root for full details.
 */

package io.element.android.appnav.loggedin

import io.element.android.libraries.architecture.AsyncData

data class LoggedInState(
    val showSyncSpinner: Boolean,
    val pusherRegistrationState: AsyncData<Unit>,
    val ignoreRegistrationError: Boolean,
    val forceNativeSlidingSyncMigration: Boolean,
    val appName: String,
    val eventSink: (LoggedInEvents) -> Unit,
)
