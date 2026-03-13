package K0;

import android.util.Base64;
import com.stub.StubApp;
import java.util.UUID;
import n1.n;
import n1.p;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends d {

    /* renamed from: e, reason: collision with root package name */
    public boolean f3604e;

    /* renamed from: f, reason: collision with root package name */
    public UUID f3605f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f3606g;

    @Override // K0.d
    public final Object b() {
        UUID uuid = this.f3605f;
        byte[] a3 = n.a(uuid, null, this.f3606g);
        byte[] bArr = this.f3606g;
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < bArr.length; i3 += 2) {
            sb2.append((char) bArr[i3]);
        }
        String sb3 = sb2.toString();
        byte[] decode = Base64.decode(sb3.substring(sb3.indexOf(StubApp.getString2(3183)) + 5, sb3.indexOf(StubApp.getString2(3184))), 0);
        byte b2 = decode[0];
        decode[0] = decode[3];
        decode[3] = b2;
        byte b10 = decode[1];
        decode[1] = decode[2];
        decode[2] = b10;
        byte b11 = decode[4];
        decode[4] = decode[5];
        decode[5] = b11;
        byte b12 = decode[6];
        decode[6] = decode[7];
        decode[7] = b12;
        return new a(uuid, a3, new p[]{new p(true, null, 8, decode, 0, 0, null)});
    }

    @Override // K0.d
    public final boolean d(String str) {
        return StubApp.getString2(3185).equals(str);
    }

    @Override // K0.d
    public final void f(XmlPullParser xmlPullParser) {
        if (StubApp.getString2(3185).equals(xmlPullParser.getName())) {
            this.f3604e = false;
        }
    }

    @Override // K0.d
    public final void j(XmlPullParser xmlPullParser) {
        if (StubApp.getString2(3185).equals(xmlPullParser.getName())) {
            this.f3604e = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, StubApp.getString2(3186));
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f3605f = UUID.fromString(attributeValue);
        }
    }

    @Override // K0.d
    public final void k(XmlPullParser xmlPullParser) {
        if (this.f3604e) {
            this.f3606g = Base64.decode(xmlPullParser.getText(), 0);
        }
    }
}
