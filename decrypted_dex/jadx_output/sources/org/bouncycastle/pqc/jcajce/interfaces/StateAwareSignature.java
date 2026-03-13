package org.bouncycastle.pqc.jcajce.interfaces;

import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.Certificate;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface StateAwareSignature {
    String getAlgorithm();

    PrivateKey getUpdatedPrivateKey();

    void initSign(PrivateKey privateKey) throws InvalidKeyException;

    void initSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException;

    void initVerify(PublicKey publicKey) throws InvalidKeyException;

    void initVerify(Certificate certificate) throws InvalidKeyException;

    boolean isSigningCapable();

    int sign(byte[] bArr, int i3, int i10) throws SignatureException;

    byte[] sign() throws SignatureException;

    void update(byte b2) throws SignatureException;

    void update(ByteBuffer byteBuffer) throws SignatureException;

    void update(byte[] bArr) throws SignatureException;

    void update(byte[] bArr, int i3, int i10) throws SignatureException;

    boolean verify(byte[] bArr) throws SignatureException;

    boolean verify(byte[] bArr, int i3, int i10) throws SignatureException;
}
