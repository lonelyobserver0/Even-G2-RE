package g1;

import Ec.l;
import c1.C0548a;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o0.C1404A;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0950a extends l {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f14202c = Pattern.compile(StubApp.getString2(17745), 32);

    /* renamed from: a, reason: collision with root package name */
    public final CharsetDecoder f14203a = StandardCharsets.UTF_8.newDecoder();

    /* renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f14204b = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // Ec.l
    public final C1404A i(C0548a c0548a, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f14204b;
        CharsetDecoder charsetDecoder2 = this.f14203a;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new C1404A(new C0952c(bArr, null, null));
        }
        Matcher matcher = f14202c.matcher(str);
        String str3 = null;
        for (int i3 = 0; matcher.find(i3); i3 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String y10 = AbstractC0624h2.y(group);
                y10.getClass();
                if (y10.equals(StubApp.getString2(17746))) {
                    str3 = group2;
                } else if (y10.equals(StubApp.getString2(17747))) {
                    str2 = group2;
                }
            }
        }
        return new C1404A(new C0952c(bArr, str2, str3));
    }
}
