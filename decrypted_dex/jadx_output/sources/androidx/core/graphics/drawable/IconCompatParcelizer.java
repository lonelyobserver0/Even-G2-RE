package androidx.core.graphics.drawable;

import V1.a;
import V1.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f9662a = aVar.f(iconCompat.f9662a, 1);
        byte[] bArr = iconCompat.f9664c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f7716e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f9664c = bArr;
        iconCompat.f9665d = aVar.g(iconCompat.f9665d, 3);
        iconCompat.f9666e = aVar.f(iconCompat.f9666e, 4);
        iconCompat.f9667f = aVar.f(iconCompat.f9667f, 5);
        iconCompat.f9668g = (ColorStateList) aVar.g(iconCompat.f9668g, 6);
        String str = iconCompat.f9670i;
        if (aVar.e(7)) {
            str = ((b) aVar).f7716e.readString();
        }
        iconCompat.f9670i = str;
        String str2 = iconCompat.j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f7716e.readString();
        }
        iconCompat.j = str2;
        iconCompat.f9669h = PorterDuff.Mode.valueOf(iconCompat.f9670i);
        switch (iconCompat.f9662a) {
            case -1:
                Parcelable parcelable = iconCompat.f9665d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f9663b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f9665d;
                if (parcelable2 != null) {
                    iconCompat.f9663b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f9664c;
                iconCompat.f9663b = bArr3;
                iconCompat.f9662a = 3;
                iconCompat.f9666e = 0;
                iconCompat.f9667f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f9664c, Charset.forName("UTF-16"));
                iconCompat.f9663b = str3;
                if (iconCompat.f9662a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f9663b = iconCompat.f9664c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f9670i = iconCompat.f9669h.name();
        switch (iconCompat.f9662a) {
            case -1:
                iconCompat.f9665d = (Parcelable) iconCompat.f9663b;
                break;
            case 1:
            case 5:
                iconCompat.f9665d = (Parcelable) iconCompat.f9663b;
                break;
            case 2:
                iconCompat.f9664c = ((String) iconCompat.f9663b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f9664c = (byte[]) iconCompat.f9663b;
                break;
            case 4:
            case 6:
                iconCompat.f9664c = iconCompat.f9663b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i3 = iconCompat.f9662a;
        if (-1 != i3) {
            aVar.j(i3, 1);
        }
        byte[] bArr = iconCompat.f9664c;
        if (bArr != null) {
            aVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f7716e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f9665d;
        if (parcelable != null) {
            aVar.k(parcelable, 3);
        }
        int i10 = iconCompat.f9666e;
        if (i10 != 0) {
            aVar.j(i10, 4);
        }
        int i11 = iconCompat.f9667f;
        if (i11 != 0) {
            aVar.j(i11, 5);
        }
        ColorStateList colorStateList = iconCompat.f9668g;
        if (colorStateList != null) {
            aVar.k(colorStateList, 6);
        }
        String str = iconCompat.f9670i;
        if (str != null) {
            aVar.i(7);
            ((b) aVar).f7716e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            aVar.i(8);
            ((b) aVar).f7716e.writeString(str2);
        }
    }
}
