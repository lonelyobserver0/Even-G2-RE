package org.bouncycastle.crypto.examples;

import com.stub.StubApp;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.generators.DESedeKeyGenerator;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DESExample {
    private PaddedBufferedBlockCipher cipher;
    private boolean encrypt;
    private BufferedInputStream in;
    private byte[] key;
    private BufferedOutputStream out;

    public DESExample() {
        this.encrypt = true;
        this.cipher = null;
        this.in = null;
        this.out = null;
        this.key = null;
    }

    public static void main(String[] strArr) {
        String string2;
        boolean z2 = true;
        if (strArr.length < 2) {
            new DESExample();
            System.err.println(StubApp.getString2(28813) + DESExample.class.getName() + StubApp.getString2(28814));
            System.exit(1);
        }
        String str = strArr[0];
        String str2 = strArr[1];
        if (strArr.length > 2) {
            string2 = strArr[2];
            z2 = false;
        } else {
            string2 = StubApp.getString2(28815);
        }
        new DESExample(str, str2, string2, z2).process();
    }

    private void performDecrypt(byte[] bArr) {
        this.cipher.init(false, new KeyParameter(bArr));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.in));
        byte[] bArr2 = null;
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    try {
                        break;
                    } catch (CryptoException unused) {
                        return;
                    }
                }
                byte[] decode = Hex.decode(readLine);
                byte[] bArr3 = new byte[this.cipher.getOutputSize(decode.length)];
                int processBytes = this.cipher.processBytes(decode, 0, decode.length, bArr3, 0);
                if (processBytes > 0) {
                    this.out.write(bArr3, 0, processBytes);
                }
                bArr2 = bArr3;
            } catch (IOException e10) {
                e10.printStackTrace();
                return;
            }
        }
        int doFinal = this.cipher.doFinal(bArr2, 0);
        if (doFinal > 0) {
            this.out.write(bArr2, 0, doFinal);
        }
    }

    private void performEncrypt(byte[] bArr) {
        this.cipher.init(true, new KeyParameter(bArr));
        byte[] bArr2 = new byte[47];
        byte[] bArr3 = new byte[this.cipher.getOutputSize(47)];
        while (true) {
            try {
                int read = this.in.read(bArr2, 0, 47);
                if (read <= 0) {
                    try {
                        break;
                    } catch (CryptoException unused) {
                        return;
                    }
                }
                int processBytes = this.cipher.processBytes(bArr2, 0, read, bArr3, 0);
                if (processBytes > 0) {
                    byte[] encode = Hex.encode(bArr3, 0, processBytes);
                    this.out.write(encode, 0, encode.length);
                    this.out.write(10);
                }
            } catch (IOException e10) {
                e10.printStackTrace();
                return;
            }
        }
        int doFinal = this.cipher.doFinal(bArr3, 0);
        if (doFinal > 0) {
            byte[] encode2 = Hex.encode(bArr3, 0, doFinal);
            this.out.write(encode2, 0, encode2.length);
            this.out.write(10);
        }
    }

    private void process() {
        this.cipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(new DESedeEngine()));
        if (this.encrypt) {
            performEncrypt(this.key);
        } else {
            performDecrypt(this.key);
        }
        try {
            this.in.close();
            this.out.flush();
            this.out.close();
        } catch (IOException e10) {
            System.err.println(StubApp.getString2(28816) + e10.getMessage());
        }
    }

    public DESExample(String str, String str2, String str3, boolean z2) {
        PrintStream printStream;
        StringBuilder sb2;
        SecureRandom secureRandom;
        String string2 = StubApp.getString2(511);
        SecureRandom secureRandom2 = null;
        this.cipher = null;
        this.in = null;
        this.out = null;
        this.key = null;
        this.encrypt = z2;
        try {
            this.in = new BufferedInputStream(new FileInputStream(str));
        } catch (FileNotFoundException unused) {
            System.err.println(StubApp.getString2(28808) + str + string2);
            System.exit(1);
        }
        try {
            this.out = new BufferedOutputStream(new FileOutputStream(str2));
        } catch (IOException unused2) {
            System.err.println(StubApp.getString2(28809) + str2 + string2);
            System.exit(1);
        }
        if (z2) {
            try {
                secureRandom = new SecureRandom();
            } catch (Exception unused3) {
            }
            try {
                secureRandom.setSeed("www.bouncycastle.org".getBytes());
            } catch (Exception unused4) {
                secureRandom2 = secureRandom;
                try {
                    System.err.println(StubApp.getString2("28810"));
                    System.exit(1);
                    secureRandom = secureRandom2;
                    KeyGenerationParameters keyGenerationParameters = new KeyGenerationParameters(secureRandom, 192);
                    DESedeKeyGenerator dESedeKeyGenerator = new DESedeKeyGenerator();
                    dESedeKeyGenerator.init(keyGenerationParameters);
                    this.key = dESedeKeyGenerator.generateKey();
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str3));
                    byte[] encode = Hex.encode(this.key);
                    bufferedOutputStream.write(encode, 0, encode.length);
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    return;
                } catch (IOException unused5) {
                    printStream = System.err;
                    sb2 = new StringBuilder(StubApp.getString2(28811));
                }
            }
            KeyGenerationParameters keyGenerationParameters2 = new KeyGenerationParameters(secureRandom, 192);
            DESedeKeyGenerator dESedeKeyGenerator2 = new DESedeKeyGenerator();
            dESedeKeyGenerator2.init(keyGenerationParameters2);
            this.key = dESedeKeyGenerator2.generateKey();
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str3));
            byte[] encode2 = Hex.encode(this.key);
            bufferedOutputStream2.write(encode2, 0, encode2.length);
            bufferedOutputStream2.flush();
            bufferedOutputStream2.close();
            return;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str3));
            int available = bufferedInputStream.available();
            byte[] bArr = new byte[available];
            bufferedInputStream.read(bArr, 0, available);
            this.key = Hex.decode(bArr);
            return;
        } catch (IOException unused6) {
            printStream = System.err;
            sb2 = new StringBuilder(StubApp.getString2(28812));
        }
        sb2.append(str3);
        sb2.append(string2);
        printStream.println(sb2.toString());
        System.exit(1);
    }
}
