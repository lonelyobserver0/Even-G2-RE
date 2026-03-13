package h1;

import M4.I;
import M4.Z;
import android.os.Parcel;
import android.os.Parcelable;
import com.stub.StubApp;
import i2.u;
import java.util.ArrayList;
import java.util.Objects;
import o0.x;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class o extends AbstractC1006i {
    public static final Parcelable.Creator<o> CREATOR = new n(0);

    /* renamed from: b, reason: collision with root package name */
    public final String f14460b;

    /* renamed from: c, reason: collision with root package name */
    public final I f14461c;

    public o(String str, String str2, Z z2) {
        super(str);
        AbstractC1550k.c(!z2.isEmpty());
        this.f14460b = str2;
        I m4 = I.m(z2);
        this.f14461c = m4;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o0.z
    public final void b(x xVar) {
        char c10;
        String str = this.f14447a;
        str.getClass();
        I i3 = this.f14461c;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals(StubApp.getString2(18303))) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 82878:
                if (str.equals(StubApp.getString2(18302))) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 82897:
                if (str.equals(StubApp.getString2(18301))) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 83253:
                if (str.equals(StubApp.getString2(18300))) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 83254:
                if (str.equals(StubApp.getString2(18299))) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 83255:
                if (str.equals(StubApp.getString2(18298))) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 83341:
                if (str.equals(StubApp.getString2(18297))) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 83378:
                if (str.equals(StubApp.getString2(18296))) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 83536:
                if (str.equals(StubApp.getString2(18295))) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 83552:
                if (str.equals(StubApp.getString2(18294))) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 2567331:
                if (str.equals(StubApp.getString2(18293))) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 2569357:
                if (str.equals(StubApp.getString2(18292))) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 2569358:
                if (str.equals(StubApp.getString2(18291))) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 2569891:
                if (str.equals(StubApp.getString2(18290))) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 2570401:
                if (str.equals(StubApp.getString2(18289))) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 2570410:
                if (str.equals(StubApp.getString2(18288))) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 2571565:
                if (str.equals(StubApp.getString2(3321))) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 2575251:
                if (str.equals(StubApp.getString2(18287))) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 2581512:
                if (str.equals(StubApp.getString2(18286))) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 2581513:
                if (str.equals(StubApp.getString2(18285))) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 2581514:
                if (str.equals(StubApp.getString2(18284))) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 2583398:
                if (str.equals(StubApp.getString2(18283))) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 2590194:
                if (str.equals(StubApp.getString2(18282))) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        try {
            switch (c10) {
                case 0:
                case '\n':
                    xVar.f18258c = (CharSequence) i3.get(0);
                    break;
                case 1:
                case 11:
                    xVar.f18273s = (CharSequence) i3.get(0);
                    break;
                case 2:
                case '\r':
                    String str2 = (String) i3.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    xVar.f18267m = Integer.valueOf(parseInt);
                    xVar.f18268n = Integer.valueOf(parseInt2);
                    break;
                case 3:
                case 18:
                    xVar.f18257b = (CharSequence) i3.get(0);
                    break;
                case 4:
                case 19:
                    xVar.f18259d = (CharSequence) i3.get(0);
                    break;
                case 5:
                case 20:
                    xVar.f18274t = (CharSequence) i3.get(0);
                    break;
                case 6:
                case 21:
                    String str3 = (String) i3.get(0);
                    int i10 = AbstractC1560u.f20190a;
                    String[] split = str3.split(StubApp.getString2(601), -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    xVar.f18263h = Integer.valueOf(parseInt3);
                    xVar.f18264i = valueOf;
                    break;
                case 7:
                case 17:
                    xVar.f18256a = (CharSequence) i3.get(0);
                    break;
                case '\b':
                case 16:
                    xVar.f18272r = (CharSequence) i3.get(0);
                    break;
                case '\t':
                case 22:
                    xVar.f18266l = Integer.valueOf(Integer.parseInt((String) i3.get(0)));
                    break;
                case '\f':
                    Integer D6 = android.support.v4.media.session.b.D((String) i3.get(0));
                    if (D6 != null) {
                        String a3 = AbstractC1007j.a(D6.intValue());
                        if (a3 != null) {
                            xVar.f18277w = a3;
                            break;
                        }
                    } else {
                        xVar.f18277w = (CharSequence) i3.get(0);
                        break;
                    }
                    break;
                case 14:
                    ArrayList d8 = d((String) i3.get(0));
                    int size = d8.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                xVar.f18268n = (Integer) d8.get(2);
                            }
                        }
                        xVar.f18267m = (Integer) d8.get(1);
                    }
                    xVar.f18266l = (Integer) d8.get(0);
                    break;
                case 15:
                    ArrayList d10 = d((String) i3.get(0));
                    int size2 = d10.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                xVar.f18271q = (Integer) d10.get(2);
                            }
                        }
                        xVar.f18270p = (Integer) d10.get(1);
                    }
                    xVar.f18269o = (Integer) d10.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            int i3 = AbstractC1560u.f20190a;
            if (Objects.equals(this.f14447a, oVar.f14447a) && Objects.equals(this.f14460b, oVar.f14460b) && this.f14461c.equals(oVar.f14461c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int d8 = u.d(527, 31, this.f14447a);
        String str = this.f14460b;
        return this.f14461c.hashCode() + ((d8 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // h1.AbstractC1006i
    public final String toString() {
        return this.f14447a + StubApp.getString2(18304) + this.f14460b + StubApp.getString2(18305) + this.f14461c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f14447a);
        parcel.writeString(this.f14460b);
        parcel.writeStringArray((String[]) this.f14461c.toArray(new String[0]));
    }
}
