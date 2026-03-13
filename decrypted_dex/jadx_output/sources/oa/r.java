package oa;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.HashMap;
import kotlin.text.Typography;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f18641a = new int[256];

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f18642b = new HashMap(256);

    static {
        for (int i3 = 0; i3 < 256; i3++) {
            if ((i3 <= 23 || i3 >= 32) && ((i3 <= 126 || i3 >= 161) && i3 != 173)) {
                a((char) i3, i3);
            }
        }
        a((char) 728, 24);
        a((char) 711, 25);
        a((char) 710, 26);
        a((char) 729, 27);
        a((char) 733, 28);
        a((char) 731, 29);
        a((char) 730, 30);
        a((char) 732, 31);
        a((char) 65533, CertificateBody.profileType);
        a(Typography.bullet, 128);
        a(Typography.dagger, 129);
        a(Typography.doubleDagger, 130);
        a(Typography.ellipsis, 131);
        a(Typography.mdash, 132);
        a(Typography.ndash, 133);
        a((char) 402, 134);
        a((char) 8260, 135);
        a((char) 8249, 136);
        a((char) 8250, 137);
        a((char) 8722, 138);
        a((char) 8240, 139);
        a(Typography.lowDoubleQuote, 140);
        a(Typography.leftDoubleQuote, 141);
        a(Typography.rightDoubleQuote, 142);
        a(Typography.leftSingleQuote, 143);
        a(Typography.rightSingleQuote, 144);
        a(Typography.lowSingleQuote, 145);
        a(Typography.tm, 146);
        a((char) 64257, 147);
        a((char) 64258, 148);
        a((char) 321, 149);
        a((char) 338, 150);
        a((char) 352, 151);
        a((char) 376, ModuleDescriptor.MODULE_VERSION);
        a((char) 381, 153);
        a((char) 305, 154);
        a((char) 322, 155);
        a((char) 339, 156);
        a((char) 353, 157);
        a((char) 382, 158);
        a((char) 65533, 159);
        a(Typography.euro, 160);
    }

    public static void a(char c10, int i3) {
        f18641a[i3] = c10;
        f18642b.put(Character.valueOf(c10), Integer.valueOf(i3));
    }
}
