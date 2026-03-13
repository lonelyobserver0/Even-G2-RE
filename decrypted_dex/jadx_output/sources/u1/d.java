package u1;

import android.graphics.Color;
import com.stub.StubApp;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p0.AbstractC1482f;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f21423a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21424b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f21425c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f21426d;

    /* renamed from: e, reason: collision with root package name */
    public final float f21427e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f21428f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f21429g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f21430h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f21431i;
    public final int j;

    public d(String str, int i3, Integer num, Integer num2, float f10, boolean z2, boolean z10, boolean z11, boolean z12, int i10) {
        this.f21423a = str;
        this.f21424b = i3;
        this.f21425c = num;
        this.f21426d = num2;
        this.f21427e = f10;
        this.f21428f = z2;
        this.f21429g = z10;
        this.f21430h = z11;
        this.f21431i = z12;
        this.j = i10;
    }

    public static int a(String str) {
        boolean z2;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z2 = true;
                    break;
                default:
                    z2 = false;
                    break;
            }
            if (z2) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC1482f.s(StubApp.getString2(23555), str, StubApp.getString2(23530));
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e10) {
            AbstractC1550k.x(StubApp.getString2(23530), StubApp.getString2(23556) + str + StubApp.getString2(620), e10);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long parseLong = str.startsWith(StubApp.getString2("23557")) ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC1550k.c(parseLong <= BodyPartID.bodyIdMax);
            return Integer.valueOf(Color.argb(android.support.v4.media.session.b.h(((parseLong >> 24) & 255) ^ 255), android.support.v4.media.session.b.h(parseLong & 255), android.support.v4.media.session.b.h((parseLong >> 8) & 255), android.support.v4.media.session.b.h((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            AbstractC1550k.x(StubApp.getString2(23530), StubApp.getString2(23558) + str + StubApp.getString2(620), e10);
            return null;
        }
    }
}
