package org.bouncycastle.crypto.io;

import E1.a;
import com.stub.StubApp;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SkippingCipher;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CipherInputStream extends FilterInputStream {
    private static final int INPUT_BUF_SIZE = 2048;
    private AEADBlockCipher aeadBlockCipher;
    private byte[] buf;
    private int bufOff;
    private BufferedBlockCipher bufferedBlockCipher;
    private boolean finalized;
    private byte[] inBuf;
    private byte[] markBuf;
    private int markBufOff;
    private long markPosition;
    private int maxBuf;
    private SkippingCipher skippingCipher;
    private StreamCipher streamCipher;

    public CipherInputStream(InputStream inputStream, BufferedBlockCipher bufferedBlockCipher) {
        this(inputStream, bufferedBlockCipher, 2048);
    }

    private void ensureCapacity(int i3, boolean z2) {
        if (z2) {
            BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
            if (bufferedBlockCipher != null) {
                i3 = bufferedBlockCipher.getOutputSize(i3);
            } else {
                AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
                if (aEADBlockCipher != null) {
                    i3 = aEADBlockCipher.getOutputSize(i3);
                }
            }
        } else {
            BufferedBlockCipher bufferedBlockCipher2 = this.bufferedBlockCipher;
            if (bufferedBlockCipher2 != null) {
                i3 = bufferedBlockCipher2.getUpdateOutputSize(i3);
            } else {
                AEADBlockCipher aEADBlockCipher2 = this.aeadBlockCipher;
                if (aEADBlockCipher2 != null) {
                    i3 = aEADBlockCipher2.getUpdateOutputSize(i3);
                }
            }
        }
        byte[] bArr = this.buf;
        if (bArr == null || bArr.length < i3) {
            this.buf = new byte[i3];
        }
    }

    private void finaliseCipher() throws IOException {
        int doFinal;
        try {
            this.finalized = true;
            ensureCapacity(0, true);
            BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
            if (bufferedBlockCipher != null) {
                doFinal = bufferedBlockCipher.doFinal(this.buf, 0);
            } else {
                AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
                if (aEADBlockCipher == null) {
                    this.maxBuf = 0;
                    return;
                }
                doFinal = aEADBlockCipher.doFinal(this.buf, 0);
            }
            this.maxBuf = doFinal;
        } catch (InvalidCipherTextException e10) {
            throw new InvalidCipherTextIOException(StubApp.getString2(29000), e10);
        } catch (Exception e11) {
            throw new IOException(a.i(StubApp.getString2(28999), e11));
        }
    }

    private int nextChunk() throws IOException {
        int processBytes;
        if (this.finalized) {
            return -1;
        }
        this.bufOff = 0;
        this.maxBuf = 0;
        while (true) {
            int i3 = this.maxBuf;
            if (i3 != 0) {
                return i3;
            }
            int read = ((FilterInputStream) this).in.read(this.inBuf);
            if (read == -1) {
                finaliseCipher();
                int i10 = this.maxBuf;
                if (i10 == 0) {
                    return -1;
                }
                return i10;
            }
            try {
                ensureCapacity(read, false);
                BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
                if (bufferedBlockCipher != null) {
                    processBytes = bufferedBlockCipher.processBytes(this.inBuf, 0, read, this.buf, 0);
                } else {
                    AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
                    if (aEADBlockCipher != null) {
                        processBytes = aEADBlockCipher.processBytes(this.inBuf, 0, read, this.buf, 0);
                    } else {
                        this.streamCipher.processBytes(this.inBuf, 0, read, this.buf, 0);
                        this.maxBuf = read;
                    }
                }
                this.maxBuf = processBytes;
            } catch (Exception e10) {
                throw new CipherIOException(StubApp.getString2(29001), e10);
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return this.maxBuf - this.bufOff;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterInputStream) this).in.close();
            this.bufOff = 0;
            this.maxBuf = 0;
            this.markBufOff = 0;
            this.markPosition = 0L;
            byte[] bArr = this.markBuf;
            if (bArr != null) {
                Arrays.fill(bArr, (byte) 0);
                this.markBuf = null;
            }
            byte[] bArr2 = this.buf;
            if (bArr2 != null) {
                Arrays.fill(bArr2, (byte) 0);
                this.buf = null;
            }
            Arrays.fill(this.inBuf, (byte) 0);
        } finally {
            if (!this.finalized) {
                finaliseCipher();
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i3) {
        ((FilterInputStream) this).in.mark(i3);
        SkippingCipher skippingCipher = this.skippingCipher;
        if (skippingCipher != null) {
            this.markPosition = skippingCipher.getPosition();
        }
        byte[] bArr = this.buf;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.markBuf = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        this.markBufOff = this.bufOff;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        if (this.skippingCipher != null) {
            return ((FilterInputStream) this).in.markSupported();
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.bufOff >= this.maxBuf && nextChunk() < 0) {
            return -1;
        }
        byte[] bArr = this.buf;
        int i3 = this.bufOff;
        this.bufOff = i3 + 1;
        return bArr[i3] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (this.skippingCipher == null) {
            throw new IOException(StubApp.getString2(29002));
        }
        ((FilterInputStream) this).in.reset();
        this.skippingCipher.seekTo(this.markPosition);
        byte[] bArr = this.markBuf;
        if (bArr != null) {
            this.buf = bArr;
        }
        this.bufOff = this.markBufOff;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0L;
        }
        if (this.skippingCipher == null) {
            int min = (int) Math.min(j, available());
            this.bufOff += min;
            return min;
        }
        long available = available();
        if (j <= available) {
            this.bufOff = (int) (this.bufOff + j);
            return j;
        }
        this.bufOff = this.maxBuf;
        long skip = ((FilterInputStream) this).in.skip(j - available);
        if (skip == this.skippingCipher.skip(skip)) {
            return skip + available;
        }
        throw new IOException(StubApp.getString2(29003) + skip + StubApp.getString2(8609));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CipherInputStream(InputStream inputStream, BufferedBlockCipher bufferedBlockCipher, int i3) {
        super(inputStream);
        this.bufferedBlockCipher = bufferedBlockCipher;
        this.inBuf = new byte[i3];
        this.skippingCipher = bufferedBlockCipher instanceof SkippingCipher ? (SkippingCipher) bufferedBlockCipher : null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public CipherInputStream(InputStream inputStream, StreamCipher streamCipher) {
        this(inputStream, streamCipher, 2048);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i3, int i10) throws IOException {
        if (this.bufOff >= this.maxBuf && nextChunk() < 0) {
            return -1;
        }
        int min = Math.min(i10, available());
        System.arraycopy(this.buf, this.bufOff, bArr, i3, min);
        this.bufOff += min;
        return min;
    }

    public CipherInputStream(InputStream inputStream, StreamCipher streamCipher, int i3) {
        super(inputStream);
        this.streamCipher = streamCipher;
        this.inBuf = new byte[i3];
        this.skippingCipher = streamCipher instanceof SkippingCipher ? (SkippingCipher) streamCipher : null;
    }

    public CipherInputStream(InputStream inputStream, AEADBlockCipher aEADBlockCipher) {
        this(inputStream, aEADBlockCipher, 2048);
    }

    public CipherInputStream(InputStream inputStream, AEADBlockCipher aEADBlockCipher, int i3) {
        super(inputStream);
        this.aeadBlockCipher = aEADBlockCipher;
        this.inBuf = new byte[i3];
        this.skippingCipher = aEADBlockCipher instanceof SkippingCipher ? (SkippingCipher) aEADBlockCipher : null;
    }
}
