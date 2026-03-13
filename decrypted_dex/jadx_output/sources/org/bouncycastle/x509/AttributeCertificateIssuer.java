package org.bouncycastle.x509;

import com.stub.StubApp;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AttCertIssuer;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.V2Form;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.util.Selector;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AttributeCertificateIssuer implements CertSelector, Selector {
    final ASN1Encodable form;

    public AttributeCertificateIssuer(X500Principal x500Principal) throws IOException {
        this(new X509Principal(x500Principal.getEncoded()));
    }

    private Object[] getNames() {
        ASN1Encodable aSN1Encodable = this.form;
        GeneralName[] names = (aSN1Encodable instanceof V2Form ? ((V2Form) aSN1Encodable).getIssuerName() : (GeneralNames) aSN1Encodable).getNames();
        ArrayList arrayList = new ArrayList(names.length);
        for (int i3 = 0; i3 != names.length; i3++) {
            if (names[i3].getTagNo() == 4) {
                try {
                    arrayList.add(new X500Principal(names[i3].getName().toASN1Primitive().getEncoded()));
                } catch (IOException unused) {
                    throw new RuntimeException(StubApp.getString2(35039));
                }
            }
        }
        return arrayList.toArray(new Object[arrayList.size()]);
    }

    private boolean matchesDN(X500Principal x500Principal, GeneralNames generalNames) {
        GeneralName[] names = generalNames.getNames();
        for (int i3 = 0; i3 != names.length; i3++) {
            GeneralName generalName = names[i3];
            if (generalName.getTagNo() == 4) {
                try {
                    if (new X500Principal(generalName.getName().toASN1Primitive().getEncoded()).equals(x500Principal)) {
                        return true;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    @Override // java.security.cert.CertSelector, org.bouncycastle.util.Selector
    public Object clone() {
        return new AttributeCertificateIssuer(AttCertIssuer.getInstance(this.form));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AttributeCertificateIssuer) {
            return this.form.equals(((AttributeCertificateIssuer) obj).form);
        }
        return false;
    }

    public Principal[] getPrincipals() {
        Object[] names = getNames();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 != names.length; i3++) {
            Object obj = names[i3];
            if (obj instanceof Principal) {
                arrayList.add(obj);
            }
        }
        return (Principal[]) arrayList.toArray(new Principal[arrayList.size()]);
    }

    public int hashCode() {
        return this.form.hashCode();
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(Object obj) {
        if (obj instanceof X509Certificate) {
            return match((Certificate) obj);
        }
        return false;
    }

    public AttributeCertificateIssuer(AttCertIssuer attCertIssuer) {
        this.form = attCertIssuer.getIssuer();
    }

    @Override // java.security.cert.CertSelector
    public boolean match(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        ASN1Encodable aSN1Encodable = this.form;
        if (aSN1Encodable instanceof V2Form) {
            V2Form v2Form = (V2Form) aSN1Encodable;
            if (v2Form.getBaseCertificateID() != null) {
                return v2Form.getBaseCertificateID().getSerial().hasValue(x509Certificate.getSerialNumber()) && matchesDN(x509Certificate.getIssuerX500Principal(), v2Form.getBaseCertificateID().getIssuer());
            }
            if (matchesDN(x509Certificate.getSubjectX500Principal(), v2Form.getIssuerName())) {
                return true;
            }
        } else {
            if (matchesDN(x509Certificate.getSubjectX500Principal(), (GeneralNames) aSN1Encodable)) {
                return true;
            }
        }
        return false;
    }

    public AttributeCertificateIssuer(X509Principal x509Principal) {
        this.form = new V2Form(GeneralNames.getInstance(new DERSequence(new GeneralName(x509Principal))));
    }
}
