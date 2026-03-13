package org.bouncycastle.jcajce.spec;

import com.mapbox.common.b;
import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.security.spec.AlgorithmParameterSpec;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SkeinParameterSpec implements AlgorithmParameterSpec {
    public static final int PARAM_TYPE_CONFIG = 4;
    public static final int PARAM_TYPE_KEY = 0;
    public static final int PARAM_TYPE_KEY_IDENTIFIER = 16;
    public static final int PARAM_TYPE_MESSAGE = 48;
    public static final int PARAM_TYPE_NONCE = 20;
    public static final int PARAM_TYPE_OUTPUT = 63;
    public static final int PARAM_TYPE_PERSONALISATION = 8;
    public static final int PARAM_TYPE_PUBLIC_KEY = 12;
    private Map parameters;

    /* renamed from: org.bouncycastle.jcajce.spec.SkeinParameterSpec$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        private Map parameters = new HashMap();

        public Builder() {
        }

        public SkeinParameterSpec build() {
            return new SkeinParameterSpec(this.parameters, null);
        }

        public Builder set(int i3, byte[] bArr) {
            if (bArr == null) {
                throw new IllegalArgumentException(StubApp.getString2(29236));
            }
            if (i3 != 0 && (i3 <= 4 || i3 >= 63 || i3 == 48)) {
                throw new IllegalArgumentException(StubApp.getString2(29234));
            }
            if (i3 == 4) {
                throw new IllegalArgumentException(StubApp.getString2(29235));
            }
            this.parameters.put(Integers.valueOf(i3), bArr);
            return this;
        }

        public Builder setKey(byte[] bArr) {
            return set(0, bArr);
        }

        public Builder setKeyIdentifier(byte[] bArr) {
            return set(16, bArr);
        }

        public Builder setNonce(byte[] bArr) {
            return set(20, bArr);
        }

        public Builder setPersonalisation(Date date, String str, String str2) {
            String string2 = StubApp.getString2(397);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, StubApp.getString2("640"));
                outputStreamWriter.write(new SimpleDateFormat(StubApp.getString2("9683")).format(date));
                outputStreamWriter.write(string2);
                outputStreamWriter.write(str);
                outputStreamWriter.write(string2);
                outputStreamWriter.write(str2);
                outputStreamWriter.close();
                return set(8, byteArrayOutputStream.toByteArray());
            } catch (IOException e10) {
                throw new IllegalStateException(b.h(StubApp.getString2(29237), e10));
            }
        }

        public Builder setPublicKey(byte[] bArr) {
            return set(12, bArr);
        }

        public Builder(SkeinParameterSpec skeinParameterSpec) {
            for (Integer num : skeinParameterSpec.parameters.keySet()) {
                this.parameters.put(num, skeinParameterSpec.parameters.get(num));
            }
        }

        public Builder setPersonalisation(Date date, Locale locale, String str, String str2) {
            String string2 = StubApp.getString2(397);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, StubApp.getString2("640"));
                outputStreamWriter.write(new SimpleDateFormat(StubApp.getString2("9683"), locale).format(date));
                outputStreamWriter.write(string2);
                outputStreamWriter.write(str);
                outputStreamWriter.write(string2);
                outputStreamWriter.write(str2);
                outputStreamWriter.close();
                return set(8, byteArrayOutputStream.toByteArray());
            } catch (IOException e10) {
                throw new IllegalStateException(b.h(StubApp.getString2(29237), e10));
            }
        }

        public Builder setPersonalisation(byte[] bArr) {
            return set(8, bArr);
        }
    }

    public SkeinParameterSpec() {
        this(new HashMap());
    }

    public byte[] getKey() {
        return Arrays.clone((byte[]) this.parameters.get(Integers.valueOf(0)));
    }

    public byte[] getKeyIdentifier() {
        return Arrays.clone((byte[]) this.parameters.get(Integers.valueOf(16)));
    }

    public byte[] getNonce() {
        return Arrays.clone((byte[]) this.parameters.get(Integers.valueOf(20)));
    }

    public Map getParameters() {
        return this.parameters;
    }

    public byte[] getPersonalisation() {
        return Arrays.clone((byte[]) this.parameters.get(Integers.valueOf(8)));
    }

    public byte[] getPublicKey() {
        return Arrays.clone((byte[]) this.parameters.get(Integers.valueOf(12)));
    }

    private SkeinParameterSpec(Map map) {
        this.parameters = Collections.unmodifiableMap(map);
    }

    public /* synthetic */ SkeinParameterSpec(Map map, AnonymousClass1 anonymousClass1) {
        this(map);
    }
}
