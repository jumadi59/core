package com.app.core.network.response


/**
 * Created by JJ date on 10/10/2023.
 * Bengkulu, Indonesia.
 * Copyright (c) Company. All rights reserved.
 **/
data class DataResponse<T>(val data: T?) : GeneralResponse()
