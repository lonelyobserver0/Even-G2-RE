package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f9661k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f9662a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9663b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f9664c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f9665d;

    /* renamed from: e, reason: collision with root package name */
    public int f9666e;

    /* renamed from: f, reason: collision with root package name */
    public int f9667f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f9668g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f9669h;

    /* renamed from: i, reason: collision with root package name */
    public String f9670i;
    public String j;

    public IconCompat() {
        this.f9662a = -1;
        this.f9664c = null;
        this.f9665d = null;
        this.f9666e = 0;
        this.f9667f = 0;
        this.f9668g = null;
        this.f9669h = f9661k;
        this.f9670i = null;
    }

    public static IconCompat b(Bundle bundle) {
        int i3 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i3);
        iconCompat.f9666e = bundle.getInt("int1");
        iconCompat.f9667f = bundle.getInt("int2");
        iconCompat.j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f9668g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f9669h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i3) {
            case -1:
            case 1:
            case 5:
                iconCompat.f9663b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i3);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f9663b = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f9663b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static IconCompat c(Icon icon) {
        icon.getClass();
        int type = icon.getType();
        if (type == 2) {
            return e(null, icon.getResPackage(), icon.getResId());
        }
        if (type == 4) {
            Uri uri = icon.getUri();
            uri.getClass();
            String uri2 = uri.toString();
            uri2.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f9663b = uri2;
            return iconCompat;
        }
        if (type != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.f9663b = icon;
            return iconCompat2;
        }
        Uri uri3 = icon.getUri();
        uri3.getClass();
        String uri4 = uri3.toString();
        uri4.getClass();
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.f9663b = uri4;
        return iconCompat3;
    }

    public static IconCompat d(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f9663b = bitmap;
        return iconCompat;
    }

    public static IconCompat e(Resources resources, String str, int i3) {
        str.getClass();
        if (i3 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f9666e = i3;
        if (resources != null) {
            try {
                iconCompat.f9663b = resources.getResourceName(i3);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f9663b = str;
        }
        iconCompat.j = str;
        return iconCompat;
    }

    public final int f() {
        int i3 = this.f9662a;
        if (i3 == -1) {
            return ((Icon) this.f9663b).getResId();
        }
        if (i3 == 2) {
            return this.f9666e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri g() {
        int i3 = this.f9662a;
        if (i3 == -1) {
            return ((Icon) this.f9663b).getUri();
        }
        if (i3 == 4 || i3 == 6) {
            return Uri.parse((String) this.f9663b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Icon h(android.content.Context r5) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.h(android.content.Context):android.graphics.drawable.Icon");
    }

    public final String toString() {
        String str;
        if (this.f9662a == -1) {
            return String.valueOf(this.f9663b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f9662a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f9662a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f9663b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f9663b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(f())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f9666e);
                if (this.f9667f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f9667f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f9663b);
                break;
        }
        if (this.f9668g != null) {
            sb2.append(" tint=");
            sb2.append(this.f9668g);
        }
        if (this.f9669h != f9661k) {
            sb2.append(" mode=");
            sb2.append(this.f9669h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i3) {
        this.f9664c = null;
        this.f9665d = null;
        this.f9666e = 0;
        this.f9667f = 0;
        this.f9668g = null;
        this.f9669h = f9661k;
        this.f9670i = null;
        this.f9662a = i3;
    }
}
