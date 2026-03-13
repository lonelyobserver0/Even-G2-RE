package org.bouncycastle.est.jcajce;

import E1.a;
import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSession;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.BCStyle;
import org.bouncycastle.est.ESTException;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JsseDefaultHostnameAuthorizer implements JsseHostnameAuthorizer {
    private static Logger LOG = Logger.getLogger(JsseDefaultHostnameAuthorizer.class.getName());
    private final Set<String> knownSuffixes;

    public JsseDefaultHostnameAuthorizer(Set<String> set) {
        this.knownSuffixes = set;
    }

    public static boolean isValidNameMatch(String str, String str2, Set<String> set) throws IOException {
        String string2 = StubApp.getString2(602);
        if (!str2.contains(string2)) {
            return str.equalsIgnoreCase(str2);
        }
        int indexOf = str2.indexOf(42);
        if (indexOf != str2.lastIndexOf(string2) || str2.contains(StubApp.getString2(15721)) || str2.charAt(str2.length() - 1) == '*') {
            return false;
        }
        int indexOf2 = str2.indexOf(46, indexOf);
        if (set != null && set.contains(Strings.toLowerCase(str2.substring(indexOf2)))) {
            throw new IOException(a.k(StubApp.getString2(29558), str2, StubApp.getString2(29559)));
        }
        String lowerCase = Strings.toLowerCase(str2.substring(indexOf + 1));
        String lowerCase2 = Strings.toLowerCase(str);
        if (lowerCase2.equals(lowerCase) || lowerCase.length() > lowerCase2.length()) {
            return false;
        }
        if (indexOf > 0) {
            return lowerCase2.startsWith(str2.substring(0, indexOf)) && lowerCase2.endsWith(lowerCase) && lowerCase2.substring(indexOf, lowerCase2.length() - lowerCase.length()).indexOf(46) < 0;
        }
        if (lowerCase2.substring(0, lowerCase2.length() - lowerCase.length()).indexOf(46) > 0) {
            return false;
        }
        return lowerCase2.endsWith(lowerCase);
    }

    @Override // org.bouncycastle.est.jcajce.JsseHostnameAuthorizer
    public boolean verified(String str, SSLSession sSLSession) throws IOException {
        try {
            return verify(str, (X509Certificate) CertificateFactory.getInstance(StubApp.getString2("29560")).generateCertificate(new ByteArrayInputStream(sSLSession.getPeerCertificates()[0].getEncoded())));
        } catch (Exception e10) {
            if (e10 instanceof ESTException) {
                throw ((ESTException) e10);
            }
            throw new ESTException(e10.getMessage(), e10);
        }
    }

    public boolean verify(String str, X509Certificate x509Certificate) throws IOException {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                if (x509Certificate.getSubjectX500Principal() == null) {
                    return false;
                }
                RDN[] rDNs = X500Name.getInstance(x509Certificate.getSubjectX500Principal().getEncoded()).getRDNs();
                for (int length = rDNs.length - 1; length >= 0; length--) {
                    AttributeTypeAndValue[] typesAndValues = rDNs[length].getTypesAndValues();
                    for (int i3 = 0; i3 != typesAndValues.length; i3++) {
                        AttributeTypeAndValue attributeTypeAndValue = typesAndValues[i3];
                        if (attributeTypeAndValue.getType().equals((ASN1Primitive) BCStyle.CN)) {
                            return isValidNameMatch(str, attributeTypeAndValue.getValue().toString(), this.knownSuffixes);
                        }
                    }
                }
                return false;
            }
            for (List<?> list : subjectAlternativeNames) {
                int intValue = ((Number) list.get(0)).intValue();
                if (intValue == 2) {
                    if (isValidNameMatch(str, list.get(1).toString(), this.knownSuffixes)) {
                        return true;
                    }
                } else if (intValue != 7) {
                    Logger logger = LOG;
                    Level level = Level.INFO;
                    if (logger.isLoggable(level)) {
                        String hexString = list.get(1) instanceof byte[] ? Hex.toHexString((byte[]) list.get(1)) : list.get(1).toString();
                        LOG.log(level, StubApp.getString2("29561") + intValue + StubApp.getString2("29562") + hexString);
                    }
                } else if (InetAddress.getByName(str).equals(InetAddress.getByName(list.get(1).toString()))) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            throw new ESTException(e10.getMessage(), e10);
        }
    }
}
