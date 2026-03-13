package androidx.core.app;

import V1.a;
import V1.b;
import V1.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f9655a;
        boolean z2 = true;
        if (aVar.e(1)) {
            cVar = aVar.h();
        }
        remoteActionCompat.f9655a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f9656b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f7716e);
        }
        remoteActionCompat.f9656b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f9657c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f7716e);
        }
        remoteActionCompat.f9657c = charSequence2;
        remoteActionCompat.f9658d = (PendingIntent) aVar.g(remoteActionCompat.f9658d, 4);
        boolean z10 = remoteActionCompat.f9659e;
        if (aVar.e(5)) {
            z10 = ((b) aVar).f7716e.readInt() != 0;
        }
        remoteActionCompat.f9659e = z10;
        boolean z11 = remoteActionCompat.f9660f;
        if (!aVar.e(6)) {
            z2 = z11;
        } else if (((b) aVar).f7716e.readInt() == 0) {
            z2 = false;
        }
        remoteActionCompat.f9660f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f9655a;
        aVar.i(1);
        aVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f9656b;
        aVar.i(2);
        Parcel parcel = ((b) aVar).f7716e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f9657c;
        aVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        aVar.k(remoteActionCompat.f9658d, 4);
        boolean z2 = remoteActionCompat.f9659e;
        aVar.i(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z10 = remoteActionCompat.f9660f;
        aVar.i(6);
        parcel.writeInt(z10 ? 1 : 0);
    }
}
