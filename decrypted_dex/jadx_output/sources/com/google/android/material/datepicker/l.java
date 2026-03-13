package com.google.android.material.datepicker;

import S3.C0272f;
import a.AbstractC0378a;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.mapbox.maps.ImageHolder;
import d0.C0772b;
import d0.C0773c;
import d0.I;
import d0.N;
import d0.S;
import d1.C0796a;
import d7.C0808c;
import e1.C0836a;
import f.C0861a;
import f.C0867g;
import f1.C0870a;
import f1.C0871b;
import f4.C0875C;
import f7.C0931b;
import g1.C0951b;
import g1.C0952c;
import h1.C0998a;
import h1.C0999b;
import h1.C1000c;
import h1.C1001d;
import h1.C1002e;
import h1.C1003f;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11934a;

    public /* synthetic */ l(int i3) {
        this.f11934a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        switch (this.f11934a) {
            case 0:
                return m.d(parcel.readInt(), parcel.readInt());
            case 1:
                return new C0772b(parcel);
            case 2:
                return new C0773c(parcel);
            case 3:
                I i3 = new I();
                i3.f13137a = parcel.readString();
                i3.f13138b = parcel.readInt();
                return i3;
            case 4:
                N n10 = new N();
                n10.f13187e = null;
                n10.f13188f = new ArrayList();
                n10.f13189g = new ArrayList();
                n10.f13183a = parcel.createStringArrayList();
                n10.f13184b = parcel.createStringArrayList();
                n10.f13185c = (C0772b[]) parcel.createTypedArray(C0772b.CREATOR);
                n10.f13186d = parcel.readInt();
                n10.f13187e = parcel.readString();
                n10.f13188f = parcel.createStringArrayList();
                n10.f13189g = parcel.createTypedArrayList(C0773c.CREATOR);
                n10.f13190h = parcel.createTypedArrayList(I.CREATOR);
                return n10;
            case 5:
                return new S(parcel);
            case 6:
                String readString = parcel.readString();
                readString.getClass();
                return new C0796a(parcel.readInt(), readString);
            case 7:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z15 = false;
                if (parcel.readInt() != 0) {
                    z2 = false;
                    z15 = true;
                    z10 = true;
                } else {
                    z2 = false;
                    z10 = true;
                }
                int readInt = parcel.readInt();
                boolean z16 = z10;
                int readInt2 = parcel.readInt();
                float readFloat = parcel.readFloat();
                float readFloat2 = parcel.readFloat();
                float readFloat3 = parcel.readFloat();
                boolean z17 = z16;
                float readFloat4 = parcel.readFloat();
                if (parcel.readInt() == 0) {
                    z17 = z2;
                }
                return new C0808c(z15, readInt, readInt2, readFloat, readFloat2, readFloat3, readFloat4, z17);
            case 8:
                return new C0836a(parcel);
            case 9:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new C0861a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 10:
                Intrinsics.checkNotNullParameter(parcel, "inParcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                Intrinsics.checkNotNull(readParcelable);
                return new C0867g((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 11:
                return new C0870a(parcel);
            case 12:
                return new C0871b(parcel);
            case 13:
                int G4 = AbstractC0378a.G(parcel);
                IBinder iBinder = null;
                IBinder iBinder2 = null;
                PendingIntent pendingIntent = null;
                String str = null;
                int i10 = 0;
                while (parcel.dataPosition() < G4) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 1) {
                        i10 = AbstractC0378a.x(parcel, readInt3);
                    } else if (c10 == 2) {
                        iBinder = AbstractC0378a.w(parcel, readInt3);
                    } else if (c10 == 3) {
                        iBinder2 = AbstractC0378a.w(parcel, readInt3);
                    } else if (c10 == 4) {
                        pendingIntent = (PendingIntent) AbstractC0378a.h(parcel, readInt3, PendingIntent.CREATOR);
                    } else if (c10 != 6) {
                        AbstractC0378a.B(parcel, readInt3);
                    } else {
                        str = AbstractC0378a.j(parcel, readInt3);
                    }
                }
                AbstractC0378a.o(parcel, G4);
                return new f4.r(i10, iBinder, iBinder2, pendingIntent, str);
            case 14:
                int G10 = AbstractC0378a.G(parcel);
                long j = Long.MAX_VALUE;
                LocationRequest locationRequest = null;
                ArrayList arrayList = null;
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
                boolean z21 = false;
                while (parcel.dataPosition() < G10) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 1) {
                        locationRequest = (LocationRequest) AbstractC0378a.h(parcel, readInt4, LocationRequest.CREATOR);
                    } else if (c11 == 5) {
                        arrayList = AbstractC0378a.m(parcel, readInt4, C0272f.CREATOR);
                    } else if (c11 == '\b') {
                        z18 = AbstractC0378a.v(parcel, readInt4);
                    } else if (c11 != '\t') {
                        switch (c11) {
                            case 11:
                                z20 = AbstractC0378a.v(parcel, readInt4);
                                break;
                            case '\f':
                                z21 = AbstractC0378a.v(parcel, readInt4);
                                break;
                            case '\r':
                                AbstractC0378a.j(parcel, readInt4);
                                break;
                            case 14:
                                j = AbstractC0378a.y(parcel, readInt4);
                                break;
                            default:
                                AbstractC0378a.B(parcel, readInt4);
                                break;
                        }
                    } else {
                        z19 = AbstractC0378a.v(parcel, readInt4);
                    }
                }
                AbstractC0378a.o(parcel, G10);
                return new f4.s(locationRequest, arrayList, z18, z19, z20, z21, j);
            case 15:
                int G11 = AbstractC0378a.G(parcel);
                f4.s sVar = null;
                IBinder iBinder3 = null;
                IBinder iBinder4 = null;
                PendingIntent pendingIntent2 = null;
                IBinder iBinder5 = null;
                String str2 = null;
                int i11 = 1;
                while (parcel.dataPosition() < G11) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            i11 = AbstractC0378a.x(parcel, readInt5);
                            break;
                        case 2:
                            sVar = (f4.s) AbstractC0378a.h(parcel, readInt5, f4.s.CREATOR);
                            break;
                        case 3:
                            iBinder3 = AbstractC0378a.w(parcel, readInt5);
                            break;
                        case 4:
                            pendingIntent2 = (PendingIntent) AbstractC0378a.h(parcel, readInt5, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinder4 = AbstractC0378a.w(parcel, readInt5);
                            break;
                        case 6:
                            iBinder5 = AbstractC0378a.w(parcel, readInt5);
                            break;
                        case 7:
                        default:
                            AbstractC0378a.B(parcel, readInt5);
                            break;
                        case '\b':
                            str2 = AbstractC0378a.j(parcel, readInt5);
                            break;
                    }
                }
                AbstractC0378a.o(parcel, G11);
                return new f4.t(i11, sVar, iBinder3, iBinder4, pendingIntent2, iBinder5, str2);
            case 16:
                int G12 = AbstractC0378a.G(parcel);
                String str3 = null;
                String str4 = null;
                String str5 = null;
                ArrayList arrayList2 = null;
                f4.q qVar = null;
                int i12 = 0;
                while (parcel.dataPosition() < G12) {
                    int readInt6 = parcel.readInt();
                    char c12 = (char) readInt6;
                    if (c12 == 1) {
                        i12 = AbstractC0378a.x(parcel, readInt6);
                    } else if (c12 == 3) {
                        str3 = AbstractC0378a.j(parcel, readInt6);
                    } else if (c12 == 4) {
                        str4 = AbstractC0378a.j(parcel, readInt6);
                    } else if (c12 == 6) {
                        str5 = AbstractC0378a.j(parcel, readInt6);
                    } else if (c12 == 7) {
                        qVar = (f4.q) AbstractC0378a.h(parcel, readInt6, f4.q.CREATOR);
                    } else if (c12 != '\b') {
                        AbstractC0378a.B(parcel, readInt6);
                    } else {
                        arrayList2 = AbstractC0378a.m(parcel, readInt6, com.google.android.gms.common.d.CREATOR);
                    }
                }
                AbstractC0378a.o(parcel, G12);
                return new f4.q(i12, str3, str4, str5, arrayList2, qVar);
            case 17:
                int G13 = AbstractC0378a.G(parcel);
                Status status = null;
                while (parcel.dataPosition() < G13) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        AbstractC0378a.B(parcel, readInt7);
                    } else {
                        status = (Status) AbstractC0378a.h(parcel, readInt7, Status.CREATOR);
                    }
                }
                AbstractC0378a.o(parcel, G13);
                return new C0875C(status);
            case 18:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z22 = false;
                if (parcel.readInt() != 0) {
                    z11 = false;
                    z22 = true;
                    z12 = true;
                } else {
                    z11 = false;
                    z12 = true;
                }
                int readInt8 = parcel.readInt();
                boolean z23 = z12;
                float readFloat5 = parcel.readFloat();
                float readFloat6 = parcel.readFloat();
                float readFloat7 = parcel.readFloat();
                float readFloat8 = parcel.readFloat();
                float readFloat9 = parcel.readFloat();
                boolean z24 = z23;
                float readFloat10 = parcel.readFloat();
                if (parcel.readInt() != 0) {
                    z13 = z24;
                } else {
                    z13 = z24;
                    z24 = z11;
                }
                if (parcel.readInt() != 0) {
                    z14 = z13;
                } else {
                    z14 = z13;
                    z13 = z11;
                }
                if (parcel.readInt() == 0) {
                    z14 = z11;
                }
                return new C0931b(z22, readInt8, readFloat5, readFloat6, readFloat7, readFloat8, readFloat9, readFloat10, z24, z13, z14, parcel.readInt() == 0 ? null : ImageHolder.CREATOR.createFromParcel(parcel));
            case 19:
                return new C0951b(parcel);
            case 20:
                return new C0952c(parcel);
            case 21:
                return new C0998a(parcel);
            case 22:
                return new C0999b(parcel);
            case 23:
                return new C1000c(parcel);
            case 24:
                return new C1001d(parcel);
            case 25:
                return new C1002e(parcel);
            case 26:
                return new C1003f(parcel);
            case 27:
                return new h1.k(parcel);
            case 28:
                return new h1.l(parcel);
            default:
                return new h1.m(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f11934a) {
            case 0:
                return new m[i3];
            case 1:
                return new C0772b[i3];
            case 2:
                return new C0773c[i3];
            case 3:
                return new I[i3];
            case 4:
                return new N[i3];
            case 5:
                return new S[i3];
            case 6:
                return new C0796a[i3];
            case 7:
                return new C0808c[i3];
            case 8:
                return new C0836a[i3];
            case 9:
                return new C0861a[i3];
            case 10:
                return new C0867g[i3];
            case 11:
                return new C0870a[i3];
            case 12:
                return new C0871b[i3];
            case 13:
                return new f4.r[i3];
            case 14:
                return new f4.s[i3];
            case 15:
                return new f4.t[i3];
            case 16:
                return new f4.q[i3];
            case 17:
                return new C0875C[i3];
            case 18:
                return new C0931b[i3];
            case 19:
                return new C0951b[i3];
            case 20:
                return new C0952c[i3];
            case 21:
                return new C0998a[i3];
            case 22:
                return new C0999b[i3];
            case 23:
                return new C1000c[i3];
            case 24:
                return new C1001d[i3];
            case 25:
                return new C1002e[i3];
            case 26:
                return new C1003f[i3];
            case 27:
                return new h1.k[i3];
            case 28:
                return new h1.l[i3];
            default:
                return new h1.m[i3];
        }
    }
}
