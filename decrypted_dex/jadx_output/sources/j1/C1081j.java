package j1;

import S3.w;
import X6.s;
import X6.t;
import a.AbstractC0378a;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.maps.ScreenCoordinate;
import j7.C1094b;
import java.util.ArrayList;
import k1.C1103a;
import kotlin.jvm.internal.Intrinsics;
import l4.C1169d;
import l4.C1172e;
import l4.C1184i;
import l4.C1213u;
import l4.C1215v;
import l4.H1;
import l4.M1;
import l4.u1;
import l4.x1;
import l4.y1;
import l4.z1;
import n.C1314O;
import n7.C1393c;
import nc.C1401a;
import o0.C1404A;
import o0.C1412I;
import o0.C1434i;
import o0.C1435j;
import o4.C1459b;
import o4.C1462e;
import org.bouncycastle.asn1.eac.EACTags;
import p7.C1496b;
import s0.C1593a;
import s7.C1604b;

/* renamed from: j1.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1081j implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15258a;

    public /* synthetic */ C1081j(int i3) {
        this.f15258a = i3;
    }

    public static void a(C1215v c1215v, Parcel parcel, int i3) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.F(parcel, 2, c1215v.f16638a);
        a4.f.E(parcel, 3, c1215v.f16639b, i3);
        a4.f.F(parcel, 4, c1215v.f16640c);
        a4.f.P(parcel, 5, 8);
        parcel.writeLong(c1215v.f16641d);
        a4.f.N(parcel, I10);
    }

    public static void b(H1 h12, Parcel parcel) {
        int I10 = a4.f.I(parcel, 20293);
        a4.f.P(parcel, 1, 4);
        parcel.writeInt(h12.f16099a);
        a4.f.F(parcel, 2, h12.f16100b);
        a4.f.P(parcel, 3, 8);
        parcel.writeLong(h12.f16101c);
        Long l9 = h12.f16102d;
        if (l9 != null) {
            a4.f.P(parcel, 4, 8);
            parcel.writeLong(l9.longValue());
        }
        a4.f.F(parcel, 6, h12.f16103e);
        a4.f.F(parcel, 7, h12.f16104f);
        Double d8 = h12.f16105g;
        if (d8 != null) {
            a4.f.P(parcel, 8, 8);
            parcel.writeDouble(d8.doubleValue());
        }
        a4.f.N(parcel, I10);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        t tVar;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        ScreenCoordinate screenCoordinate;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        float f10;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        long j;
        boolean z32;
        float f11;
        boolean z33;
        switch (this.f15258a) {
            case 0:
                return new C1082k(parcel.readLong(), parcel.readLong());
            case 1:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z34 = false;
                boolean z35 = true;
                if (parcel.readInt() != 0) {
                    z2 = false;
                    z34 = true;
                } else {
                    z2 = false;
                }
                if (parcel.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = true;
                    z35 = z2;
                }
                if (parcel.readInt() != 0) {
                    z11 = z10;
                } else {
                    z11 = z10;
                    z10 = z2;
                }
                if (parcel.readInt() != 0) {
                    z12 = z11;
                } else {
                    z12 = z11;
                    z11 = z2;
                }
                if (parcel.readInt() != 0) {
                    z13 = z12;
                } else {
                    z13 = z12;
                    z12 = z2;
                }
                t valueOf = t.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    z14 = z13;
                    tVar = valueOf;
                    z15 = z14;
                } else {
                    z14 = z13;
                    tVar = valueOf;
                    z15 = z2;
                }
                if (parcel.readInt() != 0) {
                    z16 = z14;
                } else {
                    z16 = z14;
                    z14 = z2;
                }
                if (parcel.readInt() != 0) {
                    z17 = z16;
                } else {
                    z17 = z16;
                    z16 = z2;
                }
                ScreenCoordinate screenCoordinate2 = (ScreenCoordinate) parcel.readSerializable();
                if (parcel.readInt() != 0) {
                    z18 = z17;
                    screenCoordinate = screenCoordinate2;
                    z19 = z18;
                } else {
                    z18 = z17;
                    screenCoordinate = screenCoordinate2;
                    z19 = z2;
                }
                if (parcel.readInt() != 0) {
                    z20 = z18;
                } else {
                    z20 = z18;
                    z18 = z2;
                }
                if (parcel.readInt() != 0) {
                    z21 = z20;
                } else {
                    z21 = z20;
                    z20 = z2;
                }
                if (parcel.readInt() != 0) {
                    z22 = z21;
                } else {
                    z22 = z21;
                    z21 = z2;
                }
                if (parcel.readInt() != 0) {
                    z23 = z22;
                } else {
                    z23 = z22;
                    z22 = z2;
                }
                float readFloat = parcel.readFloat();
                if (parcel.readInt() != 0) {
                    z24 = z23;
                    f10 = readFloat;
                } else {
                    f10 = readFloat;
                    z24 = z2;
                }
                return new C1094b(z34, z35, z10, z11, z12, tVar, z15, z14, z16, screenCoordinate, z19, z18, z20, z21, z22, f10, z24);
            case 2:
                return new C1103a(parcel);
            case 3:
                int G4 = AbstractC0378a.G(parcel);
                long j3 = 0;
                long j10 = 0;
                int i3 = 0;
                while (parcel.dataPosition() < G4) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        j3 = AbstractC0378a.y(parcel, readInt);
                    } else if (c10 == 2) {
                        i3 = AbstractC0378a.x(parcel, readInt);
                    } else if (c10 != 3) {
                        AbstractC0378a.B(parcel, readInt);
                    } else {
                        j10 = AbstractC0378a.y(parcel, readInt);
                    }
                }
                AbstractC0378a.o(parcel, G4);
                return new C1169d(j3, i3, j10);
            case 4:
                int G10 = AbstractC0378a.G(parcel);
                String str = null;
                String str2 = null;
                H1 h12 = null;
                String str3 = null;
                C1215v c1215v = null;
                C1215v c1215v2 = null;
                C1215v c1215v3 = null;
                long j11 = 0;
                long j12 = 0;
                long j13 = 0;
                boolean z36 = false;
                while (parcel.dataPosition() < G10) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            str = AbstractC0378a.j(parcel, readInt2);
                            break;
                        case 3:
                            str2 = AbstractC0378a.j(parcel, readInt2);
                            break;
                        case 4:
                            h12 = (H1) AbstractC0378a.h(parcel, readInt2, H1.CREATOR);
                            break;
                        case 5:
                            j11 = AbstractC0378a.y(parcel, readInt2);
                            break;
                        case 6:
                            z36 = AbstractC0378a.v(parcel, readInt2);
                            break;
                        case 7:
                            str3 = AbstractC0378a.j(parcel, readInt2);
                            break;
                        case '\b':
                            c1215v = (C1215v) AbstractC0378a.h(parcel, readInt2, C1215v.CREATOR);
                            break;
                        case '\t':
                            j12 = AbstractC0378a.y(parcel, readInt2);
                            break;
                        case '\n':
                            c1215v2 = (C1215v) AbstractC0378a.h(parcel, readInt2, C1215v.CREATOR);
                            break;
                        case 11:
                            j13 = AbstractC0378a.y(parcel, readInt2);
                            break;
                        case '\f':
                            c1215v3 = (C1215v) AbstractC0378a.h(parcel, readInt2, C1215v.CREATOR);
                            break;
                        default:
                            AbstractC0378a.B(parcel, readInt2);
                            break;
                    }
                }
                AbstractC0378a.o(parcel, G10);
                return new C1172e(str, str2, h12, j11, z36, str3, c1215v, j12, c1215v2, j13, c1215v3);
            case 5:
                int G11 = AbstractC0378a.G(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < G11) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        AbstractC0378a.B(parcel, readInt3);
                    } else {
                        bundle = AbstractC0378a.b(parcel, readInt3);
                    }
                }
                AbstractC0378a.o(parcel, G11);
                return new C1184i(bundle);
            case 6:
                int G12 = AbstractC0378a.G(parcel);
                Bundle bundle2 = null;
                while (parcel.dataPosition() < G12) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 2) {
                        AbstractC0378a.B(parcel, readInt4);
                    } else {
                        bundle2 = AbstractC0378a.b(parcel, readInt4);
                    }
                }
                AbstractC0378a.o(parcel, G12);
                return new C1213u(bundle2);
            case 7:
                int G13 = AbstractC0378a.G(parcel);
                long j14 = 0;
                String str4 = null;
                C1213u c1213u = null;
                String str5 = null;
                while (parcel.dataPosition() < G13) {
                    int readInt5 = parcel.readInt();
                    char c11 = (char) readInt5;
                    if (c11 == 2) {
                        str4 = AbstractC0378a.j(parcel, readInt5);
                    } else if (c11 == 3) {
                        c1213u = (C1213u) AbstractC0378a.h(parcel, readInt5, C1213u.CREATOR);
                    } else if (c11 == 4) {
                        str5 = AbstractC0378a.j(parcel, readInt5);
                    } else if (c11 != 5) {
                        AbstractC0378a.B(parcel, readInt5);
                    } else {
                        j14 = AbstractC0378a.y(parcel, readInt5);
                    }
                }
                AbstractC0378a.o(parcel, G13);
                return new C1215v(str4, c1213u, str5, j14);
            case 8:
                int G14 = AbstractC0378a.G(parcel);
                int i10 = 0;
                long j15 = 0;
                String str6 = null;
                while (parcel.dataPosition() < G14) {
                    int readInt6 = parcel.readInt();
                    char c12 = (char) readInt6;
                    if (c12 == 1) {
                        str6 = AbstractC0378a.j(parcel, readInt6);
                    } else if (c12 == 2) {
                        j15 = AbstractC0378a.y(parcel, readInt6);
                    } else if (c12 != 3) {
                        AbstractC0378a.B(parcel, readInt6);
                    } else {
                        i10 = AbstractC0378a.x(parcel, readInt6);
                    }
                }
                AbstractC0378a.o(parcel, G14);
                return new u1(j15, str6, i10);
            case 9:
                int G15 = AbstractC0378a.G(parcel);
                byte[] bArr = null;
                String str7 = null;
                Bundle bundle3 = null;
                String str8 = null;
                long j16 = 0;
                long j17 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < G15) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            j16 = AbstractC0378a.y(parcel, readInt7);
                            break;
                        case 2:
                            int z37 = AbstractC0378a.z(parcel, readInt7);
                            int dataPosition = parcel.dataPosition();
                            if (z37 == 0) {
                                bArr = null;
                                break;
                            } else {
                                byte[] createByteArray = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition + z37);
                                bArr = createByteArray;
                                break;
                            }
                        case 3:
                            str7 = AbstractC0378a.j(parcel, readInt7);
                            break;
                        case 4:
                            bundle3 = AbstractC0378a.b(parcel, readInt7);
                            break;
                        case 5:
                            i11 = AbstractC0378a.x(parcel, readInt7);
                            break;
                        case 6:
                            j17 = AbstractC0378a.y(parcel, readInt7);
                            break;
                        case 7:
                            str8 = AbstractC0378a.j(parcel, readInt7);
                            break;
                        default:
                            AbstractC0378a.B(parcel, readInt7);
                            break;
                    }
                }
                AbstractC0378a.o(parcel, G15);
                return new x1(j16, bArr, str7, bundle3, i11, j17, str8);
            case 10:
                int G16 = AbstractC0378a.G(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (parcel.dataPosition() < G16) {
                        int readInt8 = parcel.readInt();
                        if (((char) readInt8) != 1) {
                            AbstractC0378a.B(parcel, readInt8);
                        } else {
                            int z38 = AbstractC0378a.z(parcel, readInt8);
                            int dataPosition2 = parcel.dataPosition();
                            if (z38 == 0) {
                                break;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int readInt9 = parcel.readInt();
                            for (int i12 = 0; i12 < readInt9; i12++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(dataPosition2 + z38);
                            arrayList = arrayList2;
                        }
                    }
                    AbstractC0378a.o(parcel, G16);
                    return new y1(arrayList);
                    break;
                }
            case 11:
                int G17 = AbstractC0378a.G(parcel);
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < G17) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        AbstractC0378a.B(parcel, readInt10);
                    } else {
                        arrayList3 = AbstractC0378a.m(parcel, readInt10, x1.CREATOR);
                    }
                }
                AbstractC0378a.o(parcel, G17);
                return new z1(arrayList3);
            case 12:
                int G18 = AbstractC0378a.G(parcel);
                String str9 = null;
                Long l9 = null;
                Float f12 = null;
                String str10 = null;
                String str11 = null;
                Double d8 = null;
                long j18 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < G18) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            i13 = AbstractC0378a.x(parcel, readInt11);
                            break;
                        case 2:
                            str9 = AbstractC0378a.j(parcel, readInt11);
                            break;
                        case 3:
                            j18 = AbstractC0378a.y(parcel, readInt11);
                            break;
                        case 4:
                            int z39 = AbstractC0378a.z(parcel, readInt11);
                            if (z39 == 0) {
                                l9 = null;
                                break;
                            } else {
                                AbstractC0378a.J(parcel, z39, 8);
                                l9 = Long.valueOf(parcel.readLong());
                                break;
                            }
                        case 5:
                            int z40 = AbstractC0378a.z(parcel, readInt11);
                            if (z40 == 0) {
                                f12 = null;
                                break;
                            } else {
                                AbstractC0378a.J(parcel, z40, 4);
                                f12 = Float.valueOf(parcel.readFloat());
                                break;
                            }
                        case 6:
                            str10 = AbstractC0378a.j(parcel, readInt11);
                            break;
                        case 7:
                            str11 = AbstractC0378a.j(parcel, readInt11);
                            break;
                        case '\b':
                            int z41 = AbstractC0378a.z(parcel, readInt11);
                            if (z41 == 0) {
                                d8 = null;
                                break;
                            } else {
                                AbstractC0378a.J(parcel, z41, 8);
                                d8 = Double.valueOf(parcel.readDouble());
                                break;
                            }
                        default:
                            AbstractC0378a.B(parcel, readInt11);
                            break;
                    }
                }
                AbstractC0378a.o(parcel, G18);
                return new H1(i13, str9, j18, l9, f12, str10, str11, d8);
            case 13:
                int G19 = AbstractC0378a.G(parcel);
                boolean z42 = false;
                int i14 = 0;
                boolean z43 = false;
                boolean z44 = false;
                int i15 = 0;
                int i16 = 0;
                long j19 = 0;
                long j20 = 0;
                long j21 = 0;
                long j22 = 0;
                long j23 = 0;
                long j24 = 0;
                long j25 = 0;
                String str12 = "";
                String str13 = str12;
                String str14 = str13;
                String str15 = str14;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                Boolean bool = null;
                ArrayList<String> arrayList4 = null;
                String str22 = null;
                String str23 = null;
                int i17 = 100;
                boolean z45 = true;
                boolean z46 = true;
                long j26 = -2147483648L;
                while (parcel.dataPosition() < G19) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 2:
                            str16 = AbstractC0378a.j(parcel, readInt12);
                            break;
                        case 3:
                            str17 = AbstractC0378a.j(parcel, readInt12);
                            break;
                        case 4:
                            str18 = AbstractC0378a.j(parcel, readInt12);
                            break;
                        case 5:
                            str19 = AbstractC0378a.j(parcel, readInt12);
                            break;
                        case 6:
                            j19 = AbstractC0378a.y(parcel, readInt12);
                            break;
                        case 7:
                            j20 = AbstractC0378a.y(parcel, readInt12);
                            break;
                        case '\b':
                            str20 = AbstractC0378a.j(parcel, readInt12);
                            break;
                        case '\t':
                            z45 = AbstractC0378a.v(parcel, readInt12);
                            break;
                        case '\n':
                            z42 = AbstractC0378a.v(parcel, readInt12);
                            break;
                        case 11:
                            j26 = AbstractC0378a.y(parcel, readInt12);
                            break;
                        case '\f':
                            str21 = AbstractC0378a.j(parcel, readInt12);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            AbstractC0378a.B(parcel, readInt12);
                            break;
                        case 14:
                            j21 = AbstractC0378a.y(parcel, readInt12);
                            break;
                        case 15:
                            i14 = AbstractC0378a.x(parcel, readInt12);
                            break;
                        case 16:
                            z46 = AbstractC0378a.v(parcel, readInt12);
                            break;
                        case 18:
                            z43 = AbstractC0378a.v(parcel, readInt12);
                            break;
                        case 21:
                            int z47 = AbstractC0378a.z(parcel, readInt12);
                            if (z47 == 0) {
                                bool = null;
                                break;
                            } else {
                                AbstractC0378a.J(parcel, z47, 4);
                                bool = Boolean.valueOf(parcel.readInt() != 0);
                                break;
                            }
                        case 22:
                            j22 = AbstractC0378a.y(parcel, readInt12);
                            break;
                        case 23:
                            int z48 = AbstractC0378a.z(parcel, readInt12);
                            int dataPosition3 = parcel.dataPosition();
                            if (z48 == 0) {
                                arrayList4 = null;
                                break;
                            } else {
                                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                                parcel.setDataPosition(dataPosition3 + z48);
                                arrayList4 = createStringArrayList;
                                break;
                            }
                        case 25:
                            str12 = AbstractC0378a.j(parcel, readInt12);
                            break;
                        case 26:
                            str13 = AbstractC0378a.j(parcel, readInt12);
                            break;
                        case 27:
                            str22 = AbstractC0378a.j(parcel, readInt12);
                            break;
                        case 28:
                            z44 = AbstractC0378a.v(parcel, readInt12);
                            break;
                        case 29:
                            j23 = AbstractC0378a.y(parcel, readInt12);
                            break;
                        case 30:
                            i17 = AbstractC0378a.x(parcel, readInt12);
                            break;
                        case 31:
                            str14 = AbstractC0378a.j(parcel, readInt12);
                            break;
                        case ' ':
                            i15 = AbstractC0378a.x(parcel, readInt12);
                            break;
                        case '\"':
                            j24 = AbstractC0378a.y(parcel, readInt12);
                            break;
                        case '#':
                            str23 = AbstractC0378a.j(parcel, readInt12);
                            break;
                        case EACTags.APPLICATION_EXPIRATION_DATE /* 36 */:
                            str15 = AbstractC0378a.j(parcel, readInt12);
                            break;
                        case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                            j25 = AbstractC0378a.y(parcel, readInt12);
                            break;
                        case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                            i16 = AbstractC0378a.x(parcel, readInt12);
                            break;
                    }
                }
                AbstractC0378a.o(parcel, G19);
                return new M1(str16, str17, str18, str19, j19, j20, str20, z45, z42, j26, str21, j21, i14, z46, z43, bool, j22, arrayList4, str12, str13, str22, z44, j23, i17, str14, i15, j24, str23, str15, j25, i16);
            case 14:
                C1314O c1314o = new C1314O(parcel);
                c1314o.f17440a = parcel.readByte() != 0;
                return c1314o;
            case 15:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z49 = false;
                boolean z50 = true;
                if (parcel.readInt() != 0) {
                    z25 = false;
                    z49 = true;
                } else {
                    z25 = false;
                }
                if (parcel.readInt() != 0) {
                    z26 = true;
                } else {
                    z26 = true;
                    z50 = z25;
                }
                int readInt13 = parcel.readInt();
                boolean z51 = z26;
                float readFloat2 = parcel.readFloat();
                if (parcel.readInt() != 0) {
                    z27 = z51;
                } else {
                    z27 = z51;
                    z51 = z25;
                }
                int readInt14 = parcel.readInt();
                int readInt15 = parcel.readInt();
                String readString = parcel.readString();
                boolean z52 = z27;
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z52 = z25;
                }
                return new C1393c(z49, z50, readInt13, readFloat2, z51, readInt14, readInt15, readString, readString2, z52, s.valueOf(parcel.readString()), parcel.readString(), (X6.f) parcel.readParcelable(C1393c.class.getClassLoader()));
            case 16:
                C1401a c1401a = new C1401a();
                c1401a.f17893a = parcel.createByteArray();
                return c1401a;
            case 17:
                return new C1435j(parcel);
            case 18:
                return new C1434i(parcel);
            case 19:
                return new C1404A(parcel);
            case 20:
                return new C1412I(parcel);
            case 21:
                int G20 = AbstractC0378a.G(parcel);
                Intent intent = null;
                int i18 = 0;
                int i19 = 0;
                while (parcel.dataPosition() < G20) {
                    int readInt16 = parcel.readInt();
                    char c13 = (char) readInt16;
                    if (c13 == 1) {
                        i18 = AbstractC0378a.x(parcel, readInt16);
                    } else if (c13 == 2) {
                        i19 = AbstractC0378a.x(parcel, readInt16);
                    } else if (c13 != 3) {
                        AbstractC0378a.B(parcel, readInt16);
                    } else {
                        intent = (Intent) AbstractC0378a.h(parcel, readInt16, Intent.CREATOR);
                    }
                }
                AbstractC0378a.o(parcel, G20);
                return new C1459b(i18, i19, intent);
            case 22:
                int G21 = AbstractC0378a.G(parcel);
                ArrayList<String> arrayList5 = null;
                String str24 = null;
                while (parcel.dataPosition() < G21) {
                    int readInt17 = parcel.readInt();
                    char c14 = (char) readInt17;
                    if (c14 == 1) {
                        int z53 = AbstractC0378a.z(parcel, readInt17);
                        int dataPosition4 = parcel.dataPosition();
                        if (z53 == 0) {
                            arrayList5 = null;
                        } else {
                            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition4 + z53);
                            arrayList5 = createStringArrayList2;
                        }
                    } else if (c14 != 2) {
                        AbstractC0378a.B(parcel, readInt17);
                    } else {
                        str24 = AbstractC0378a.j(parcel, readInt17);
                    }
                }
                AbstractC0378a.o(parcel, G21);
                return new C1462e(arrayList5, str24);
            case 23:
                int G22 = AbstractC0378a.G(parcel);
                com.google.android.gms.common.b bVar = null;
                int i20 = 0;
                w wVar = null;
                while (parcel.dataPosition() < G22) {
                    int readInt18 = parcel.readInt();
                    char c15 = (char) readInt18;
                    if (c15 == 1) {
                        i20 = AbstractC0378a.x(parcel, readInt18);
                    } else if (c15 == 2) {
                        bVar = (com.google.android.gms.common.b) AbstractC0378a.h(parcel, readInt18, com.google.android.gms.common.b.CREATOR);
                    } else if (c15 != 3) {
                        AbstractC0378a.B(parcel, readInt18);
                    } else {
                        wVar = (w) AbstractC0378a.h(parcel, readInt18, w.CREATOR);
                    }
                }
                AbstractC0378a.o(parcel, G22);
                return new o4.f(i20, bVar, wVar);
            case 24:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new C1496b(parcel.readInt() != 0, parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
            case 25:
                return new C1593a(parcel);
            case 26:
                return new s0.d(parcel);
            case 27:
                return new s0.e(parcel);
            default:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z54 = false;
                if (parcel.readInt() != 0) {
                    z28 = false;
                    z54 = true;
                    z29 = true;
                } else {
                    z28 = false;
                    z29 = true;
                }
                int readInt19 = parcel.readInt();
                boolean z55 = z29;
                float readFloat3 = parcel.readFloat();
                float readFloat4 = parcel.readFloat();
                float readFloat5 = parcel.readFloat();
                float readFloat6 = parcel.readFloat();
                int readInt20 = parcel.readInt();
                int readInt21 = parcel.readInt();
                int readInt22 = parcel.readInt();
                float readFloat7 = parcel.readFloat();
                float readFloat8 = parcel.readFloat();
                float readFloat9 = parcel.readFloat();
                float readFloat10 = parcel.readFloat();
                boolean z56 = z55;
                float readFloat11 = parcel.readFloat();
                if (parcel.readInt() != 0) {
                    z30 = z56;
                } else {
                    z30 = z56;
                    z56 = z28;
                }
                long readLong = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z31 = z30;
                    j = readLong;
                    z32 = z31;
                } else {
                    z31 = z30;
                    j = readLong;
                    z32 = z28;
                }
                float readFloat12 = parcel.readFloat();
                if (parcel.readInt() != 0) {
                    z33 = z31;
                    f11 = readFloat12;
                } else {
                    f11 = readFloat12;
                    z33 = z28;
                }
                return new C1604b(z54, readInt19, readFloat3, readFloat4, readFloat5, readFloat6, readInt20, readInt21, readInt22, readFloat7, readFloat8, readFloat9, readFloat10, readFloat11, z56, j, z32, f11, z33);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f15258a) {
            case 0:
                return new C1082k[i3];
            case 1:
                return new C1094b[i3];
            case 2:
                return new C1103a[i3];
            case 3:
                return new C1169d[i3];
            case 4:
                return new C1172e[i3];
            case 5:
                return new C1184i[i3];
            case 6:
                return new C1213u[i3];
            case 7:
                return new C1215v[i3];
            case 8:
                return new u1[i3];
            case 9:
                return new x1[i3];
            case 10:
                return new y1[i3];
            case 11:
                return new z1[i3];
            case 12:
                return new H1[i3];
            case 13:
                return new M1[i3];
            case 14:
                return new C1314O[i3];
            case 15:
                return new C1393c[i3];
            case 16:
                return new C1401a[i3];
            case 17:
                return new C1435j[i3];
            case 18:
                return new C1434i[i3];
            case 19:
                return new C1404A[i3];
            case 20:
                return new C1412I[i3];
            case 21:
                return new C1459b[i3];
            case 22:
                return new C1462e[i3];
            case 23:
                return new o4.f[i3];
            case 24:
                return new C1496b[i3];
            case 25:
                return new C1593a[i3];
            case 26:
                return new s0.d[i3];
            case 27:
                return new s0.e[i3];
            default:
                return new C1604b[i3];
        }
    }
}
