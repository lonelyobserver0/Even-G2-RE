package com.mapbox.navigator;

import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface HistoryRecorderHandleInterface {
    void pushHistory(String str, String str2);

    List<String> startRecording();

    void stopRecording(DumpHistoryCallback dumpHistoryCallback);
}
