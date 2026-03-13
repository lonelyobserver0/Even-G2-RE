package h1;

import M4.I;
import S3.C0272f;
import S3.D;
import a.AbstractC0378a;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.stub.StubApp;
import f4.q;
import i1.C1032a;
import i4.C1038b;
import i4.C1039c;
import i4.C1040d;
import i4.C1041e;
import i4.C1042f;
import i4.C1043g;
import i4.C1045i;
import i4.C1046j;
import i4.C1051o;
import i4.C1053q;
import i4.C1054r;
import i4.C1055s;
import i4.C1056t;
import i4.v;
import i4.w;
import i4.x;
import j1.C1072a;
import j1.C1076e;
import j1.C1077f;
import j1.C1080i;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class n implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14459a;

    public /* synthetic */ n(int i3) {
        this.f14459a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f14459a) {
            case 0:
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new o(readString, readString2, I.n(createStringArray));
            case 1:
                return new p(parcel);
            case 2:
                return new C1032a(parcel);
            case 3:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, i1.b.class.getClassLoader());
                return new i1.c(arrayList);
            case 4:
                return new i1.b(parcel.readLong(), parcel.readInt(), parcel.readLong());
            case 5:
                return new i1.d(parcel);
            case 6:
                int G4 = AbstractC0378a.G(parcel);
                q qVar = null;
                int i3 = 0;
                boolean z2 = false;
                long j = Long.MAX_VALUE;
                while (parcel.dataPosition() < G4) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        j = AbstractC0378a.y(parcel, readInt);
                    } else if (c10 == 2) {
                        i3 = AbstractC0378a.x(parcel, readInt);
                    } else if (c10 == 3) {
                        z2 = AbstractC0378a.v(parcel, readInt);
                    } else if (c10 != 5) {
                        AbstractC0378a.B(parcel, readInt);
                    } else {
                        qVar = (q) AbstractC0378a.h(parcel, readInt, q.CREATOR);
                    }
                }
                AbstractC0378a.o(parcel, G4);
                return new C1046j(j, i3, z2, qVar);
            case 7:
                int G10 = AbstractC0378a.G(parcel);
                v[] vVarArr = null;
                long j3 = 0;
                int i10 = 1;
                int i11 = 1;
                int i12 = 1000;
                while (parcel.dataPosition() < G10) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i10 = AbstractC0378a.x(parcel, readInt2);
                            break;
                        case 2:
                            i11 = AbstractC0378a.x(parcel, readInt2);
                            break;
                        case 3:
                            j3 = AbstractC0378a.y(parcel, readInt2);
                            break;
                        case 4:
                            i12 = AbstractC0378a.x(parcel, readInt2);
                            break;
                        case 5:
                            vVarArr = (v[]) AbstractC0378a.l(parcel, readInt2, v.CREATOR);
                            break;
                        case 6:
                            AbstractC0378a.v(parcel, readInt2);
                            break;
                        default:
                            AbstractC0378a.B(parcel, readInt2);
                            break;
                    }
                }
                AbstractC0378a.o(parcel, G10);
                return new LocationAvailability(i12, i10, i11, j3, vVarArr);
            case 8:
                int G11 = AbstractC0378a.G(parcel);
                q qVar2 = null;
                boolean z10 = false;
                while (parcel.dataPosition() < G11) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 == 1) {
                        z10 = AbstractC0378a.v(parcel, readInt3);
                    } else if (c11 != 2) {
                        AbstractC0378a.B(parcel, readInt3);
                    } else {
                        qVar2 = (q) AbstractC0378a.h(parcel, readInt3, q.CREATOR);
                    }
                }
                AbstractC0378a.o(parcel, G11);
                return new C1056t(z10, qVar2);
            case 9:
                int G12 = AbstractC0378a.G(parcel);
                WorkSource workSource = new WorkSource();
                q qVar3 = null;
                boolean z11 = false;
                int i13 = 0;
                int i14 = 0;
                boolean z12 = false;
                long j10 = -1;
                float f10 = 0.0f;
                int i15 = Integer.MAX_VALUE;
                long j11 = Long.MAX_VALUE;
                long j12 = Long.MAX_VALUE;
                long j13 = 0;
                long j14 = 600000;
                long j15 = 3600000;
                int i16 = 102;
                while (parcel.dataPosition() < G12) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            i16 = AbstractC0378a.x(parcel, readInt4);
                            break;
                        case 2:
                            j15 = AbstractC0378a.y(parcel, readInt4);
                            break;
                        case 3:
                            j14 = AbstractC0378a.y(parcel, readInt4);
                            break;
                        case 4:
                        case 14:
                        default:
                            AbstractC0378a.B(parcel, readInt4);
                            break;
                        case 5:
                            j11 = AbstractC0378a.y(parcel, readInt4);
                            break;
                        case 6:
                            i15 = AbstractC0378a.x(parcel, readInt4);
                            break;
                        case 7:
                            AbstractC0378a.K(parcel, readInt4, 4);
                            f10 = parcel.readFloat();
                            break;
                        case '\b':
                            j13 = AbstractC0378a.y(parcel, readInt4);
                            break;
                        case '\t':
                            z11 = AbstractC0378a.v(parcel, readInt4);
                            break;
                        case '\n':
                            j12 = AbstractC0378a.y(parcel, readInt4);
                            break;
                        case 11:
                            j10 = AbstractC0378a.y(parcel, readInt4);
                            break;
                        case '\f':
                            i13 = AbstractC0378a.x(parcel, readInt4);
                            break;
                        case '\r':
                            i14 = AbstractC0378a.x(parcel, readInt4);
                            break;
                        case 15:
                            z12 = AbstractC0378a.v(parcel, readInt4);
                            break;
                        case 16:
                            workSource = (WorkSource) AbstractC0378a.h(parcel, readInt4, WorkSource.CREATOR);
                            break;
                        case 17:
                            qVar3 = (q) AbstractC0378a.h(parcel, readInt4, q.CREATOR);
                            break;
                    }
                }
                AbstractC0378a.o(parcel, G12);
                return new LocationRequest(i16, j15, j14, j13, j11, j12, i15, f10, z11, j10, i13, i14, z12, workSource, qVar3);
            case 10:
                int G13 = AbstractC0378a.G(parcel);
                List list = LocationResult.f11797b;
                while (parcel.dataPosition() < G13) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        AbstractC0378a.B(parcel, readInt5);
                    } else {
                        list = AbstractC0378a.m(parcel, readInt5, Location.CREATOR);
                    }
                }
                AbstractC0378a.o(parcel, G13);
                return new LocationResult(list);
            case 11:
                int G14 = AbstractC0378a.G(parcel);
                boolean z13 = false;
                ArrayList arrayList2 = null;
                boolean z14 = false;
                while (parcel.dataPosition() < G14) {
                    int readInt6 = parcel.readInt();
                    char c12 = (char) readInt6;
                    if (c12 == 1) {
                        arrayList2 = AbstractC0378a.m(parcel, readInt6, LocationRequest.CREATOR);
                    } else if (c12 == 2) {
                        z13 = AbstractC0378a.v(parcel, readInt6);
                    } else if (c12 != 3) {
                        AbstractC0378a.B(parcel, readInt6);
                    } else {
                        z14 = AbstractC0378a.v(parcel, readInt6);
                    }
                }
                AbstractC0378a.o(parcel, G14);
                return new C1051o(arrayList2, z13, z14);
            case 12:
                int G15 = AbstractC0378a.G(parcel);
                Status status = null;
                C1054r c1054r = null;
                while (parcel.dataPosition() < G15) {
                    int readInt7 = parcel.readInt();
                    char c13 = (char) readInt7;
                    if (c13 == 1) {
                        status = (Status) AbstractC0378a.h(parcel, readInt7, Status.CREATOR);
                    } else if (c13 != 2) {
                        AbstractC0378a.B(parcel, readInt7);
                    } else {
                        c1054r = (C1054r) AbstractC0378a.h(parcel, readInt7, C1054r.CREATOR);
                    }
                }
                AbstractC0378a.o(parcel, G15);
                return new C1053q(status, c1054r);
            case 13:
                int G16 = AbstractC0378a.G(parcel);
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
                while (parcel.dataPosition() < G16) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            z15 = AbstractC0378a.v(parcel, readInt8);
                            break;
                        case 2:
                            z16 = AbstractC0378a.v(parcel, readInt8);
                            break;
                        case 3:
                            z17 = AbstractC0378a.v(parcel, readInt8);
                            break;
                        case 4:
                            z18 = AbstractC0378a.v(parcel, readInt8);
                            break;
                        case 5:
                            z19 = AbstractC0378a.v(parcel, readInt8);
                            break;
                        case 6:
                            z20 = AbstractC0378a.v(parcel, readInt8);
                            break;
                        default:
                            AbstractC0378a.B(parcel, readInt8);
                            break;
                    }
                }
                AbstractC0378a.o(parcel, G16);
                return new C1054r(z15, z16, z17, z18, z19, z20);
            case 14:
                int G17 = AbstractC0378a.G(parcel);
                long j16 = -1;
                long j17 = -1;
                int i17 = 1;
                int i18 = 1;
                while (parcel.dataPosition() < G17) {
                    int readInt9 = parcel.readInt();
                    char c14 = (char) readInt9;
                    if (c14 == 1) {
                        i17 = AbstractC0378a.x(parcel, readInt9);
                    } else if (c14 == 2) {
                        i18 = AbstractC0378a.x(parcel, readInt9);
                    } else if (c14 == 3) {
                        j16 = AbstractC0378a.y(parcel, readInt9);
                    } else if (c14 != 4) {
                        AbstractC0378a.B(parcel, readInt9);
                    } else {
                        j17 = AbstractC0378a.y(parcel, readInt9);
                    }
                }
                AbstractC0378a.o(parcel, G17);
                return new v(i17, i18, j16, j17);
            case 15:
                int G18 = AbstractC0378a.G(parcel);
                int i19 = 0;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < G18) {
                    int readInt10 = parcel.readInt();
                    char c15 = (char) readInt10;
                    if (c15 == 1) {
                        arrayList3 = AbstractC0378a.m(parcel, readInt10, w.CREATOR);
                    } else if (c15 != 2) {
                        AbstractC0378a.B(parcel, readInt10);
                    } else {
                        i19 = AbstractC0378a.x(parcel, readInt10);
                    }
                }
                AbstractC0378a.o(parcel, G18);
                return new C1055s(i19, arrayList3);
            case 16:
                int G19 = AbstractC0378a.G(parcel);
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (parcel.dataPosition() < G19) {
                    int readInt11 = parcel.readInt();
                    char c16 = (char) readInt11;
                    if (c16 == 1) {
                        i20 = AbstractC0378a.x(parcel, readInt11);
                    } else if (c16 == 2) {
                        i21 = AbstractC0378a.x(parcel, readInt11);
                    } else if (c16 == 3) {
                        i22 = AbstractC0378a.x(parcel, readInt11);
                    } else if (c16 != 4) {
                        AbstractC0378a.B(parcel, readInt11);
                    } else {
                        i23 = AbstractC0378a.x(parcel, readInt11);
                    }
                }
                AbstractC0378a.o(parcel, G19);
                return new w(i20, i21, i22, i23);
            case 17:
                int G20 = AbstractC0378a.G(parcel);
                WorkSource workSource2 = null;
                String str = null;
                int[] iArr = null;
                String str2 = null;
                String str3 = null;
                long j18 = 0;
                long j19 = 0;
                boolean z21 = false;
                boolean z22 = false;
                while (parcel.dataPosition() < G20) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            j18 = AbstractC0378a.y(parcel, readInt12);
                            break;
                        case 2:
                            z21 = AbstractC0378a.v(parcel, readInt12);
                            break;
                        case 3:
                            workSource2 = (WorkSource) AbstractC0378a.h(parcel, readInt12, WorkSource.CREATOR);
                            break;
                        case 4:
                            str = AbstractC0378a.j(parcel, readInt12);
                            break;
                        case 5:
                            iArr = AbstractC0378a.d(parcel, readInt12);
                            break;
                        case 6:
                            z22 = AbstractC0378a.v(parcel, readInt12);
                            break;
                        case 7:
                            str2 = AbstractC0378a.j(parcel, readInt12);
                            break;
                        case '\b':
                            j19 = AbstractC0378a.y(parcel, readInt12);
                            break;
                        case '\t':
                            str3 = AbstractC0378a.j(parcel, readInt12);
                            break;
                        default:
                            AbstractC0378a.B(parcel, readInt12);
                            break;
                    }
                }
                AbstractC0378a.o(parcel, G20);
                return new x(j18, z21, workSource2, str, iArr, z22, str2, j19, str3);
            case 18:
                int G21 = AbstractC0378a.G(parcel);
                ArrayList arrayList4 = null;
                boolean z23 = false;
                Bundle bundle = null;
                int i24 = 0;
                long j20 = 0;
                long j21 = 0;
                while (parcel.dataPosition() < G21) {
                    int readInt13 = parcel.readInt();
                    char c17 = (char) readInt13;
                    if (c17 == 1) {
                        arrayList4 = AbstractC0378a.m(parcel, readInt13, C1043g.CREATOR);
                    } else if (c17 == 2) {
                        j20 = AbstractC0378a.y(parcel, readInt13);
                    } else if (c17 == 3) {
                        j21 = AbstractC0378a.y(parcel, readInt13);
                    } else if (c17 == 4) {
                        i24 = AbstractC0378a.x(parcel, readInt13);
                    } else if (c17 != 5) {
                        AbstractC0378a.B(parcel, readInt13);
                    } else {
                        bundle = AbstractC0378a.b(parcel, readInt13);
                    }
                }
                AbstractC0378a.o(parcel, G21);
                ActivityRecognitionResult activityRecognitionResult = new ActivityRecognitionResult();
                D.a(StubApp.getString2(18280), (arrayList4 == null || arrayList4.isEmpty()) ? false : true);
                if (j20 > 0 && j21 > 0) {
                    z23 = true;
                }
                D.a(StubApp.getString2(18281), z23);
                activityRecognitionResult.f11774a = arrayList4;
                activityRecognitionResult.f11775b = j20;
                activityRecognitionResult.f11776c = j21;
                activityRecognitionResult.f11777d = i24;
                activityRecognitionResult.f11778e = bundle;
                return activityRecognitionResult;
            case 19:
                int G22 = AbstractC0378a.G(parcel);
                int i25 = 0;
                int i26 = 0;
                while (parcel.dataPosition() < G22) {
                    int readInt14 = parcel.readInt();
                    char c18 = (char) readInt14;
                    if (c18 == 1) {
                        i25 = AbstractC0378a.x(parcel, readInt14);
                    } else if (c18 != 2) {
                        AbstractC0378a.B(parcel, readInt14);
                    } else {
                        i26 = AbstractC0378a.x(parcel, readInt14);
                    }
                }
                AbstractC0378a.o(parcel, G22);
                return new C1038b(i25, i26);
            case 20:
                int G23 = AbstractC0378a.G(parcel);
                long j22 = 0;
                int i27 = 0;
                int i28 = 0;
                while (parcel.dataPosition() < G23) {
                    int readInt15 = parcel.readInt();
                    char c19 = (char) readInt15;
                    if (c19 == 1) {
                        i27 = AbstractC0378a.x(parcel, readInt15);
                    } else if (c19 == 2) {
                        i28 = AbstractC0378a.x(parcel, readInt15);
                    } else if (c19 != 3) {
                        AbstractC0378a.B(parcel, readInt15);
                    } else {
                        j22 = AbstractC0378a.y(parcel, readInt15);
                    }
                }
                AbstractC0378a.o(parcel, G23);
                return new C1039c(i27, i28, j22);
            case 21:
                int G24 = AbstractC0378a.G(parcel);
                ArrayList arrayList5 = null;
                String str4 = null;
                ArrayList arrayList6 = null;
                String str5 = null;
                while (parcel.dataPosition() < G24) {
                    int readInt16 = parcel.readInt();
                    char c20 = (char) readInt16;
                    if (c20 == 1) {
                        arrayList5 = AbstractC0378a.m(parcel, readInt16, C1038b.CREATOR);
                    } else if (c20 == 2) {
                        str4 = AbstractC0378a.j(parcel, readInt16);
                    } else if (c20 == 3) {
                        arrayList6 = AbstractC0378a.m(parcel, readInt16, C0272f.CREATOR);
                    } else if (c20 != 4) {
                        AbstractC0378a.B(parcel, readInt16);
                    } else {
                        str5 = AbstractC0378a.j(parcel, readInt16);
                    }
                }
                AbstractC0378a.o(parcel, G24);
                return new C1040d(arrayList5, str4, arrayList6, str5);
            case 22:
                int G25 = AbstractC0378a.G(parcel);
                ArrayList arrayList7 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < G25) {
                    int readInt17 = parcel.readInt();
                    char c21 = (char) readInt17;
                    if (c21 == 1) {
                        arrayList7 = AbstractC0378a.m(parcel, readInt17, C1039c.CREATOR);
                    } else if (c21 != 2) {
                        AbstractC0378a.B(parcel, readInt17);
                    } else {
                        bundle2 = AbstractC0378a.b(parcel, readInt17);
                    }
                }
                AbstractC0378a.o(parcel, G25);
                return new C1041e(arrayList7, bundle2);
            case 23:
                int G26 = AbstractC0378a.G(parcel);
                WorkSource workSource3 = new WorkSource();
                q qVar4 = null;
                int i29 = 0;
                boolean z24 = false;
                int i30 = 0;
                long j23 = Long.MAX_VALUE;
                long j24 = Long.MAX_VALUE;
                int i31 = 102;
                while (parcel.dataPosition() < G26) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 1:
                            j23 = AbstractC0378a.y(parcel, readInt18);
                            break;
                        case 2:
                            i29 = AbstractC0378a.x(parcel, readInt18);
                            break;
                        case 3:
                            i31 = AbstractC0378a.x(parcel, readInt18);
                            break;
                        case 4:
                            j24 = AbstractC0378a.y(parcel, readInt18);
                            break;
                        case 5:
                            z24 = AbstractC0378a.v(parcel, readInt18);
                            break;
                        case 6:
                            workSource3 = (WorkSource) AbstractC0378a.h(parcel, readInt18, WorkSource.CREATOR);
                            break;
                        case 7:
                            i30 = AbstractC0378a.x(parcel, readInt18);
                            break;
                        case '\b':
                        default:
                            AbstractC0378a.B(parcel, readInt18);
                            break;
                        case '\t':
                            qVar4 = (q) AbstractC0378a.h(parcel, readInt18, q.CREATOR);
                            break;
                    }
                }
                AbstractC0378a.o(parcel, G26);
                return new C1042f(j23, i29, i31, j24, z24, i30, workSource3, qVar4);
            case 24:
                int G27 = AbstractC0378a.G(parcel);
                int i32 = 0;
                int i33 = 0;
                while (parcel.dataPosition() < G27) {
                    int readInt19 = parcel.readInt();
                    char c22 = (char) readInt19;
                    if (c22 == 1) {
                        i32 = AbstractC0378a.x(parcel, readInt19);
                    } else if (c22 != 2) {
                        AbstractC0378a.B(parcel, readInt19);
                    } else {
                        i33 = AbstractC0378a.x(parcel, readInt19);
                    }
                }
                AbstractC0378a.o(parcel, G27);
                return new C1043g(i32, i33);
            case 25:
                int G28 = AbstractC0378a.G(parcel);
                boolean z25 = false;
                long j25 = 0;
                while (parcel.dataPosition() < G28) {
                    int readInt20 = parcel.readInt();
                    char c23 = (char) readInt20;
                    if (c23 == 2) {
                        j25 = AbstractC0378a.y(parcel, readInt20);
                    } else if (c23 != 6) {
                        AbstractC0378a.B(parcel, readInt20);
                    } else {
                        z25 = AbstractC0378a.v(parcel, readInt20);
                    }
                }
                AbstractC0378a.o(parcel, G28);
                return new C1045i(j25, z25);
            case 26:
                return new C1072a(parcel);
            case 27:
                return new C1076e(parcel);
            case 28:
                return new C1077f();
            default:
                return new C1080i(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f14459a) {
            case 0:
                return new o[i3];
            case 1:
                return new p[i3];
            case 2:
                return new C1032a[i3];
            case 3:
                return new i1.c[i3];
            case 4:
                return new i1.b[i3];
            case 5:
                return new i1.d[i3];
            case 6:
                return new C1046j[i3];
            case 7:
                return new LocationAvailability[i3];
            case 8:
                return new C1056t[i3];
            case 9:
                return new LocationRequest[i3];
            case 10:
                return new LocationResult[i3];
            case 11:
                return new C1051o[i3];
            case 12:
                return new C1053q[i3];
            case 13:
                return new C1054r[i3];
            case 14:
                return new v[i3];
            case 15:
                return new C1055s[i3];
            case 16:
                return new w[i3];
            case 17:
                return new x[i3];
            case 18:
                return new ActivityRecognitionResult[i3];
            case 19:
                return new C1038b[i3];
            case 20:
                return new C1039c[i3];
            case 21:
                return new C1040d[i3];
            case 22:
                return new C1041e[i3];
            case 23:
                return new C1042f[i3];
            case 24:
                return new C1043g[i3];
            case 25:
                return new C1045i[i3];
            case 26:
                return new C1072a[i3];
            case 27:
                return new C1076e[i3];
            case 28:
                return new C1077f[i3];
            default:
                return new C1080i[i3];
        }
    }
}
