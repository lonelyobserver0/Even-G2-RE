package org.bouncycastle.x509;

import java.security.cert.CertPath;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.LocalizedException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertPathReviewerException extends LocalizedException {
    private CertPath certPath;
    private int index;

    public CertPathReviewerException(ErrorBundle errorBundle) {
        super(errorBundle);
        this.index = -1;
        this.certPath = null;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getIndex() {
        return this.index;
    }

    public CertPathReviewerException(ErrorBundle errorBundle, Throwable th) {
        super(errorBundle, th);
        this.index = -1;
        this.certPath = null;
    }

    public CertPathReviewerException(ErrorBundle errorBundle, Throwable th, CertPath certPath, int i3) {
        super(errorBundle, th);
        this.index = -1;
        this.certPath = null;
        if (certPath == null || i3 == -1) {
            throw new IllegalArgumentException();
        }
        if (i3 < -1 || i3 >= certPath.getCertificates().size()) {
            throw new IndexOutOfBoundsException();
        }
        this.certPath = certPath;
        this.index = i3;
    }

    public CertPathReviewerException(ErrorBundle errorBundle, CertPath certPath, int i3) {
        super(errorBundle);
        this.index = -1;
        this.certPath = null;
        if (certPath == null || i3 == -1) {
            throw new IllegalArgumentException();
        }
        if (i3 < -1 || i3 >= certPath.getCertificates().size()) {
            throw new IndexOutOfBoundsException();
        }
        this.certPath = certPath;
        this.index = i3;
    }
}
