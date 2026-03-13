package com.google.android.gms.location;

import Q3.l;
import R3.C0233b;
import android.app.PendingIntent;
import i4.C1040d;
import i4.C1055s;
import q4.j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface ActivityRecognitionClient extends l {
    @Override // Q3.l
    /* synthetic */ C0233b getApiKey();

    j removeActivityTransitionUpdates(PendingIntent pendingIntent);

    j removeActivityUpdates(PendingIntent pendingIntent);

    j removeSleepSegmentUpdates(PendingIntent pendingIntent);

    j requestActivityTransitionUpdates(C1040d c1040d, PendingIntent pendingIntent);

    j requestActivityUpdates(long j, PendingIntent pendingIntent);

    j requestSleepSegmentUpdates(PendingIntent pendingIntent, C1055s c1055s);
}
