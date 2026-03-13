package com.google.android.gms.common;

import a.AbstractC0378a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11205a;

    public /* synthetic */ n(int i3) {
        this.f11205a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f11205a) {
            case 0:
                int G4 = AbstractC0378a.G(parcel);
                PendingIntent pendingIntent = null;
                int i3 = 0;
                int i10 = 0;
                String str = null;
                while (parcel.dataPosition() < G4) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        i3 = AbstractC0378a.x(parcel, readInt);
                    } else if (c10 == 2) {
                        i10 = AbstractC0378a.x(parcel, readInt);
                    } else if (c10 == 3) {
                        pendingIntent = (PendingIntent) AbstractC0378a.h(parcel, readInt, PendingIntent.CREATOR);
                    } else if (c10 != 4) {
                        AbstractC0378a.B(parcel, readInt);
                    } else {
                        str = AbstractC0378a.j(parcel, readInt);
                    }
                }
                AbstractC0378a.o(parcel, G4);
                return new b(i3, i10, pendingIntent, str);
            case 1:
                int G10 = AbstractC0378a.G(parcel);
                long j = -1;
                int i11 = 0;
                String str2 = null;
                while (parcel.dataPosition() < G10) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 1) {
                        str2 = AbstractC0378a.j(parcel, readInt2);
                    } else if (c11 == 2) {
                        i11 = AbstractC0378a.x(parcel, readInt2);
                    } else if (c11 != 3) {
                        AbstractC0378a.B(parcel, readInt2);
                    } else {
                        j = AbstractC0378a.y(parcel, readInt2);
                    }
                }
                AbstractC0378a.o(parcel, G10);
                return new d(j, str2, i11);
            default:
                int G11 = AbstractC0378a.G(parcel);
                boolean z2 = false;
                int i12 = 0;
                String str3 = null;
                int i13 = 0;
                while (parcel.dataPosition() < G11) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 == 1) {
                        z2 = AbstractC0378a.v(parcel, readInt3);
                    } else if (c12 == 2) {
                        str3 = AbstractC0378a.j(parcel, readInt3);
                    } else if (c12 == 3) {
                        i13 = AbstractC0378a.x(parcel, readInt3);
                    } else if (c12 != 4) {
                        AbstractC0378a.B(parcel, readInt3);
                    } else {
                        i12 = AbstractC0378a.x(parcel, readInt3);
                    }
                }
                AbstractC0378a.o(parcel, G11);
                return new u(str3, i13, i12, z2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        switch (this.f11205a) {
            case 0:
                return new b[i3];
            case 1:
                return new d[i3];
            default:
                return new u[i3];
        }
    }
}
