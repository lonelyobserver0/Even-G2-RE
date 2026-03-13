package com.google.android.gms.internal.measurement;

import a.AbstractC0378a;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class V implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11394a;

    public /* synthetic */ V(int i3) {
        this.f11394a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f11394a) {
            case 0:
                int G4 = AbstractC0378a.G(parcel);
                Bundle bundle = null;
                String str = null;
                boolean z2 = false;
                long j = 0;
                long j3 = 0;
                while (parcel.dataPosition() < G4) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        j = AbstractC0378a.y(parcel, readInt);
                    } else if (c10 == 2) {
                        j3 = AbstractC0378a.y(parcel, readInt);
                    } else if (c10 == 3) {
                        z2 = AbstractC0378a.v(parcel, readInt);
                    } else if (c10 == 7) {
                        bundle = AbstractC0378a.b(parcel, readInt);
                    } else if (c10 != '\b') {
                        AbstractC0378a.B(parcel, readInt);
                    } else {
                        str = AbstractC0378a.j(parcel, readInt);
                    }
                }
                AbstractC0378a.o(parcel, G4);
                return new U(j, j3, z2, bundle, str);
            default:
                int G10 = AbstractC0378a.G(parcel);
                String str2 = null;
                int i3 = 0;
                Intent intent = null;
                while (parcel.dataPosition() < G10) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 1) {
                        i3 = AbstractC0378a.x(parcel, readInt2);
                    } else if (c11 == 2) {
                        str2 = AbstractC0378a.j(parcel, readInt2);
                    } else if (c11 != 3) {
                        AbstractC0378a.B(parcel, readInt2);
                    } else {
                        intent = (Intent) AbstractC0378a.h(parcel, readInt2, Intent.CREATOR);
                    }
                }
                AbstractC0378a.o(parcel, G10);
                return new W(i3, str2, intent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        switch (this.f11394a) {
            case 0:
                return new U[i3];
            default:
                return new W[i3];
        }
    }
}
