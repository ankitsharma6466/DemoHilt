package com.test.core

import android.net.Uri

fun createDestinationUri(path: String): Uri = Uri.parse("hiltdemo://$path")