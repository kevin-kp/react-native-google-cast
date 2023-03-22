package com.reactnative.googlecast.types;

import androidx.annotation.Nullable;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.cast.MediaLiveSeekableRange;

public class RNGCMediaLiveSeekableRange {
  public static @Nullable
  WritableMap toJson(final @Nullable MediaLiveSeekableRange liveSeekableRange) {
    if (liveSeekableRange == null) return null;

    final WritableMap json = Arguments.createMap();

    if (liveSeekableRange.getEndTime() != null) {
      json.putDouble("endTime", liveSeekableRange.getEndTime() / 1000.0);
    }

    if (liveSeekableRange.getStartTime() != null) {
      json.putDouble("startTime", liveSeekableRange.getStartTime() / 1000.0);
    }

    if (liveSeekableRange.isLiveDone() != null) {
      json.putBoolean("isLiveDone", liveSeekableRange.isLiveDone());
    }

    if (liveSeekableRange.isMovingWindow() != null) {
      json.putBoolean("isMovingWindow", liveSeekableRange.isMovingWindow());
    }

    return json;
  }
}
