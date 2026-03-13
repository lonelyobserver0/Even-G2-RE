package org.bouncycastle.cms;

import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.operator.InputAEADDecryptor;
import org.bouncycastle.operator.InputDecryptor;
import org.bouncycastle.operator.MacCalculator;
import org.bouncycastle.util.io.TeeInputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RecipientOperator {
    private final Object operator;

    public RecipientOperator(InputDecryptor inputDecryptor) {
        this.operator = inputDecryptor;
    }

    public OutputStream getAADStream() {
        return ((InputAEADDecryptor) this.operator).getAADStream();
    }

    public InputStream getInputStream(InputStream inputStream) {
        Object obj = this.operator;
        return obj instanceof InputDecryptor ? ((InputDecryptor) obj).getInputStream(inputStream) : new TeeInputStream(inputStream, ((MacCalculator) this.operator).getOutputStream());
    }

    public byte[] getMac() {
        return ((MacCalculator) this.operator).getMac();
    }

    public boolean isAEADBased() {
        return this.operator instanceof InputAEADDecryptor;
    }

    public boolean isMacBased() {
        return this.operator instanceof MacCalculator;
    }

    public RecipientOperator(MacCalculator macCalculator) {
        this.operator = macCalculator;
    }
}
