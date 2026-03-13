package org.bouncycastle.est;

import E1.a;
import Xa.h;
import com.mapbox.common.b;
import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Base64;
import org.bouncycastle.util.encoders.Hex;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HttpAuth implements ESTAuth {
    private static final DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder = new DefaultDigestAlgorithmIdentifierFinder();
    private static final Set<String> validParts;
    private final DigestCalculatorProvider digestCalculatorProvider;
    private final SecureRandom nonceGenerator;
    private final char[] password;
    private final String realm;
    private final String username;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(StubApp.getString2(29503));
        hashSet.add(StubApp.getString2(29510));
        hashSet.add(StubApp.getString2(7331));
        hashSet.add(StubApp.getString2(29212));
        hashSet.add(StubApp.getString2(29511));
        validParts = Collections.unmodifiableSet(hashSet);
    }

    public HttpAuth(String str, String str2, char[] cArr) {
        this(str, str2, cArr, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ESTResponse doDigestFunction(ESTResponse eSTResponse) throws IOException {
        String string2;
        String next;
        String string22 = StubApp.getString2(401);
        String string23 = StubApp.getString2(29512);
        eSTResponse.close();
        ESTRequest originalRequest = eSTResponse.getOriginalRequest();
        try {
            Map<String, String> splitCSL = HttpUtil.splitCSL(string23, eSTResponse.getHeader(string22));
            try {
                String path = originalRequest.getURL().toURI().getPath();
                Iterator<String> it = splitCSL.keySet().iterator();
                do {
                    boolean hasNext = it.hasNext();
                    string2 = StubApp.getString2(620);
                    if (hasNext) {
                        next = it.next();
                    } else {
                        String method = originalRequest.getMethod();
                        String string24 = StubApp.getString2(29503);
                        String str = splitCSL.get(string24);
                        String string25 = StubApp.getString2(29510);
                        String str2 = splitCSL.get(string25);
                        String string26 = StubApp.getString2(7331);
                        String str3 = splitCSL.get(string26);
                        String string27 = StubApp.getString2(29212);
                        String str4 = splitCSL.get(string27);
                        String string28 = StubApp.getString2(29511);
                        String str5 = splitCSL.get(string28);
                        ArrayList arrayList = new ArrayList();
                        String str6 = this.realm;
                        String str7 = str4;
                        if (str6 != null && !str6.equals(str)) {
                            throw new ESTException(StubApp.getString2(29504) + this.realm + StubApp.getString2(29505) + str + string2, null, 401, null);
                        }
                        if (str7 == null) {
                            str7 = StubApp.getString2(4894);
                        }
                        if (str7.length() == 0) {
                            throw new ESTException(StubApp.getString2(29526));
                        }
                        String upperCase = Strings.toUpperCase(str7);
                        if (str5 == null) {
                            throw new ESTException(StubApp.getString2(29525));
                        }
                        if (str5.length() == 0) {
                            throw new ESTException(StubApp.getString2(29524));
                        }
                        String[] split = Strings.toLowerCase(str5).split(StubApp.getString2(321));
                        int i3 = 0;
                        while (true) {
                            int length = split.length;
                            String[] strArr = split;
                            String string29 = StubApp.getString2(29514);
                            String str8 = string27;
                            String string210 = StubApp.getString2(29515);
                            if (i3 == length) {
                                AlgorithmIdentifier lookupDigest = lookupDigest(upperCase);
                                if (lookupDigest == null || lookupDigest.getAlgorithm() == null) {
                                    throw new IOException(a.j(StubApp.getString2(29523), upperCase));
                                }
                                DigestCalculator digestCalculator = getDigestCalculator(upperCase, lookupDigest);
                                OutputStream outputStream = digestCalculator.getOutputStream();
                                String makeNonce = makeNonce(10);
                                update(outputStream, this.username);
                                String string211 = StubApp.getString2(478);
                                update(outputStream, string211);
                                update(outputStream, str);
                                update(outputStream, string211);
                                update(outputStream, this.password);
                                outputStream.close();
                                byte[] digest = digestCalculator.getDigest();
                                if (upperCase.endsWith(StubApp.getString2(29517))) {
                                    DigestCalculator digestCalculator2 = getDigestCalculator(upperCase, lookupDigest);
                                    OutputStream outputStream2 = digestCalculator2.getOutputStream();
                                    update(outputStream2, Hex.toHexString(digest));
                                    update(outputStream2, string211);
                                    update(outputStream2, str2);
                                    update(outputStream2, string211);
                                    update(outputStream2, makeNonce);
                                    outputStream2.close();
                                    digest = digestCalculator2.getDigest();
                                }
                                String hexString = Hex.toHexString(digest);
                                DigestCalculator digestCalculator3 = getDigestCalculator(upperCase, lookupDigest);
                                OutputStream outputStream3 = digestCalculator3.getOutputStream();
                                if (((String) arrayList.get(0)).equals(string210)) {
                                    DigestCalculator digestCalculator4 = getDigestCalculator(upperCase, lookupDigest);
                                    OutputStream outputStream4 = digestCalculator4.getOutputStream();
                                    originalRequest.writeData(outputStream4);
                                    outputStream4.close();
                                    byte[] digest2 = digestCalculator4.getDigest();
                                    update(outputStream3, method);
                                    update(outputStream3, string211);
                                    update(outputStream3, path);
                                    update(outputStream3, string211);
                                    update(outputStream3, Hex.toHexString(digest2));
                                } else if (((String) arrayList.get(0)).equals(string29)) {
                                    update(outputStream3, method);
                                    update(outputStream3, string211);
                                    update(outputStream3, path);
                                }
                                outputStream3.close();
                                String hexString2 = Hex.toHexString(digestCalculator3.getDigest());
                                DigestCalculator digestCalculator5 = getDigestCalculator(upperCase, lookupDigest);
                                OutputStream outputStream5 = digestCalculator5.getOutputStream();
                                boolean contains = arrayList.contains(StubApp.getString2(29518));
                                String string212 = StubApp.getString2(29519);
                                update(outputStream5, hexString);
                                update(outputStream5, string211);
                                update(outputStream5, str2);
                                update(outputStream5, string211);
                                if (!contains) {
                                    update(outputStream5, string212);
                                    update(outputStream5, string211);
                                    update(outputStream5, makeNonce);
                                    update(outputStream5, string211);
                                    if (((String) arrayList.get(0)).equals(string210)) {
                                        update(outputStream5, string210);
                                    } else {
                                        update(outputStream5, string29);
                                    }
                                    update(outputStream5, string211);
                                }
                                update(outputStream5, hexString2);
                                outputStream5.close();
                                String hexString3 = Hex.toHexString(digestCalculator5.getDigest());
                                HashMap hashMap = new HashMap();
                                hashMap.put(StubApp.getString2(17899), this.username);
                                hashMap.put(string24, str);
                                hashMap.put(string25, str2);
                                hashMap.put(StubApp.getString2(614), path);
                                hashMap.put(StubApp.getString2(29520), hexString3);
                                boolean equals = ((String) arrayList.get(0)).equals(string210);
                                String string213 = StubApp.getString2(29521);
                                String string214 = StubApp.getString2(29522);
                                if (!equals) {
                                    if (((String) arrayList.get(0)).equals(string29)) {
                                        hashMap.put(string28, string29);
                                    }
                                    hashMap.put(str8, upperCase);
                                    if (str3 != null || str3.length() == 0) {
                                        hashMap.put(string26, makeNonce(20));
                                    }
                                    ESTRequestBuilder withHijacker = new ESTRequestBuilder(originalRequest).withHijacker(null);
                                    withHijacker.setHeader(StubApp.getString2(2407), HttpUtil.mergeCSL(string23, hashMap));
                                    return originalRequest.getClient().doRequest(withHijacker.build());
                                }
                                hashMap.put(string28, string210);
                                hashMap.put(string214, string212);
                                hashMap.put(string213, makeNonce);
                                hashMap.put(str8, upperCase);
                                if (str3 != null) {
                                }
                                hashMap.put(string26, makeNonce(20));
                                ESTRequestBuilder withHijacker2 = new ESTRequestBuilder(originalRequest).withHijacker(null);
                                withHijacker2.setHeader(StubApp.getString2(2407), HttpUtil.mergeCSL(string23, hashMap));
                                return originalRequest.getClient().doRequest(withHijacker2.build());
                            }
                            if (!strArr[i3].equals(string29) && !strArr[i3].equals(string210)) {
                                throw new ESTException(h.g(i3, StubApp.getString2(29516), string2));
                            }
                            String trim = strArr[i3].trim();
                            if (!arrayList.contains(trim)) {
                                arrayList.add(trim);
                            }
                            i3++;
                            split = strArr;
                            string27 = str8;
                        }
                    }
                } while (validParts.contains(next));
                throw new ESTException(StubApp.getString2(29513) + ((Object) next) + string2);
            } catch (Exception e10) {
                throw new IOException(u.r(e10, new StringBuilder(StubApp.getString2(29527))));
            }
        } catch (Throwable th) {
            throw new ESTException(StubApp.getString2(29528) + th.getMessage(), th, eSTResponse.getStatusCode(), new ByteArrayInputStream(eSTResponse.getHeader(string22).getBytes()));
        }
    }

    private DigestCalculator getDigestCalculator(String str, AlgorithmIdentifier algorithmIdentifier) throws IOException {
        try {
            return this.digestCalculatorProvider.get(algorithmIdentifier);
        } catch (OperatorCreationException e10) {
            StringBuilder l9 = b.l(StubApp.getString2(29529), str, StubApp.getString2(994));
            l9.append(e10.getMessage());
            throw new IOException(l9.toString());
        }
    }

    private AlgorithmIdentifier lookupDigest(String str) {
        if (str.endsWith(StubApp.getString2(29517))) {
            str = str.substring(0, str.length() - 5);
        }
        return str.equals(StubApp.getString2(29530)) ? digestAlgorithmIdentifierFinder.find(NISTObjectIdentifiers.id_sha512_256) : digestAlgorithmIdentifierFinder.find(str);
    }

    private String makeNonce(int i3) {
        byte[] bArr = new byte[i3];
        this.nonceGenerator.nextBytes(bArr);
        return Hex.toHexString(bArr);
    }

    private void update(OutputStream outputStream, String str) throws IOException {
        outputStream.write(Strings.toUTF8ByteArray(str));
    }

    @Override // org.bouncycastle.est.ESTAuth
    public void applyAuth(ESTRequestBuilder eSTRequestBuilder) {
        eSTRequestBuilder.withHijacker(new ESTHijacker() { // from class: org.bouncycastle.est.HttpAuth.1
            @Override // org.bouncycastle.est.ESTHijacker
            public ESTResponse hijack(ESTRequest eSTRequest, Source source) throws IOException {
                ESTResponse eSTResponse = new ESTResponse(eSTRequest, source);
                if (eSTResponse.getStatusCode() != 401) {
                    return eSTResponse;
                }
                String string2 = StubApp.getString2(401);
                String header = eSTResponse.getHeader(string2);
                if (header == null) {
                    throw new ESTException(StubApp.getString2(29509));
                }
                String lowerCase = Strings.toLowerCase(header);
                if (lowerCase.startsWith(StubApp.getString2(13292))) {
                    return HttpAuth.this.doDigestFunction(eSTResponse);
                }
                if (!lowerCase.startsWith(StubApp.getString2(18726))) {
                    throw new ESTException(StubApp.getString2(29508).concat(lowerCase));
                }
                eSTResponse.close();
                Map<String, String> splitCSL = HttpUtil.splitCSL(StubApp.getString2(16044), eSTResponse.getHeader(string2));
                if (HttpAuth.this.realm != null) {
                    String str = HttpAuth.this.realm;
                    String string22 = StubApp.getString2(29503);
                    if (!str.equals(splitCSL.get(string22))) {
                        StringBuilder sb2 = new StringBuilder(StubApp.getString2(29504));
                        sb2.append(HttpAuth.this.realm);
                        sb2.append(StubApp.getString2(29505));
                        throw new ESTException(AbstractC1482f.k(sb2, splitCSL.get(string22), StubApp.getString2(620)), null, 401, null);
                    }
                }
                ESTRequestBuilder withHijacker = new ESTRequestBuilder(eSTRequest).withHijacker(null);
                if (HttpAuth.this.realm != null && HttpAuth.this.realm.length() > 0) {
                    withHijacker.setHeader(string2, StubApp.getString2(29506) + HttpAuth.this.realm + StubApp.getString2(2123));
                }
                if (HttpAuth.this.username.contains(StubApp.getString2(478))) {
                    throw new IllegalArgumentException(StubApp.getString2(29507));
                }
                char[] cArr = new char[HttpAuth.this.username.length() + 1 + HttpAuth.this.password.length];
                System.arraycopy(HttpAuth.this.username.toCharArray(), 0, cArr, 0, HttpAuth.this.username.length());
                cArr[HttpAuth.this.username.length()] = ':';
                System.arraycopy(HttpAuth.this.password, 0, cArr, HttpAuth.this.username.length() + 1, HttpAuth.this.password.length);
                withHijacker.setHeader(StubApp.getString2(2407), StubApp.getString2(4897) + Base64.toBase64String(Strings.toByteArray(cArr)));
                ESTResponse doRequest = eSTRequest.getClient().doRequest(withHijacker.build());
                Arrays.fill(cArr, (char) 0);
                return doRequest;
            }
        });
    }

    public HttpAuth(String str, String str2, char[] cArr, SecureRandom secureRandom, DigestCalculatorProvider digestCalculatorProvider) {
        this.realm = str;
        this.username = str2;
        this.password = cArr;
        this.nonceGenerator = secureRandom;
        this.digestCalculatorProvider = digestCalculatorProvider;
    }

    private void update(OutputStream outputStream, char[] cArr) throws IOException {
        outputStream.write(Strings.toUTF8ByteArray(cArr));
    }

    public HttpAuth(String str, char[] cArr) {
        this(null, str, cArr, null, null);
    }

    public HttpAuth(String str, char[] cArr, SecureRandom secureRandom, DigestCalculatorProvider digestCalculatorProvider) {
        this(null, str, cArr, secureRandom, digestCalculatorProvider);
    }
}
