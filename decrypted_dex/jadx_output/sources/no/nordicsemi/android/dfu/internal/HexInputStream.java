package no.nordicsemi.android.dfu.internal;

import com.stub.StubApp;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import no.nordicsemi.android.dfu.internal.exception.HexFileValidationException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HexInputStream extends FilterInputStream {
    private final int LINE_LENGTH;
    private final int MBRSize;
    private final int available;
    private int bytesRead;
    private int lastAddress;
    private final byte[] localBuf;
    private int localPos;
    private int pos;
    private int size;

    public HexInputStream(InputStream inputStream, int i3) throws HexFileValidationException, IOException {
        super(new BufferedInputStream(inputStream));
        this.LINE_LENGTH = 128;
        byte[] bArr = new byte[128];
        this.localBuf = bArr;
        this.localPos = 128;
        this.size = bArr.length;
        this.lastAddress = 0;
        this.MBRSize = i3;
        this.available = calculateBinSize(i3);
    }

    private int asciiToInt(int i3) {
        if (i3 >= 65) {
            return i3 - 55;
        }
        if (i3 >= 48) {
            return i3 - 48;
        }
        return -1;
    }

    private int calculateBinSize(int i3) throws HexFileValidationException, IOException {
        int readAddress;
        InputStream inputStream = ((FilterInputStream) this).in;
        inputStream.mark(inputStream.available());
        try {
            int read = inputStream.read();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                checkComma(read);
                int readByte = readByte(inputStream);
                int readAddress2 = readAddress(inputStream);
                int readByte2 = readByte(inputStream);
                if (readByte2 != 0) {
                    if (readByte2 == 1) {
                        inputStream.reset();
                        return i11;
                    }
                    if (readByte2 == 2) {
                        readAddress = readAddress(inputStream) << 4;
                        if (i11 > 0 && (readAddress >> 16) != (i10 >> 16) + 1) {
                            inputStream.reset();
                            return i11;
                        }
                        skip(inputStream, 2L);
                    } else if (readByte2 == 4) {
                        int readAddress3 = readAddress(inputStream);
                        if (i11 > 0 && readAddress3 != (i10 >> 16) + 1) {
                            inputStream.reset();
                            return i11;
                        }
                        readAddress = readAddress3 << 16;
                        skip(inputStream, 2L);
                    }
                    i10 = readAddress;
                    while (true) {
                        read = inputStream.read();
                        if (read != 10 || read == 13) {
                        }
                    }
                } else if (readAddress2 + i10 >= i3) {
                    i11 += readByte;
                }
                skip(inputStream, (readByte * 2) + 2);
                while (true) {
                    read = inputStream.read();
                    if (read != 10) {
                    }
                }
            }
        } catch (Throwable th) {
            inputStream.reset();
            throw th;
        }
    }

    private void checkComma(int i3) throws HexFileValidationException {
        if (i3 != 58) {
            throw new HexFileValidationException(StubApp.getString2(26677));
        }
    }

    private int readAddress(InputStream inputStream) throws IOException {
        return readByte(inputStream) | (readByte(inputStream) << 8);
    }

    private int readByte(InputStream inputStream) throws IOException {
        return asciiToInt(inputStream.read()) | (asciiToInt(inputStream.read()) << 4);
    }

    private int readLine() throws IOException {
        if (this.pos == -1) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        while (true) {
            int read = inputStream.read();
            this.pos++;
            if (read != 10 && read != 13) {
                checkComma(read);
                int readByte = readByte(inputStream);
                this.pos += 2;
                int readAddress = readAddress(inputStream);
                this.pos += 4;
                int readByte2 = readByte(inputStream);
                int i3 = this.pos + 2;
                this.pos = i3;
                if (readByte2 != 0) {
                    if (readByte2 == 1) {
                        this.pos = -1;
                        return 0;
                    }
                    if (readByte2 == 2) {
                        int readAddress2 = readAddress(inputStream) << 4;
                        int i10 = this.pos + 4;
                        this.pos = i10;
                        if (this.bytesRead > 0 && (readAddress2 >> 16) != (this.lastAddress >> 16) + 1) {
                            return 0;
                        }
                        this.lastAddress = readAddress2;
                        this.pos = (int) (i10 + skip(inputStream, 2L));
                    } else if (readByte2 != 4) {
                        this.pos = (int) (i3 + skip(inputStream, (readByte * 2) + 2));
                    } else {
                        int readAddress3 = readAddress(inputStream);
                        int i11 = this.pos + 4;
                        this.pos = i11;
                        if (this.bytesRead > 0 && readAddress3 != (this.lastAddress >> 16) + 1) {
                            return 0;
                        }
                        this.lastAddress = readAddress3 << 16;
                        this.pos = (int) (i11 + skip(inputStream, 2L));
                    }
                } else if (this.lastAddress + readAddress < this.MBRSize) {
                    this.pos = (int) (i3 + skip(inputStream, (readByte * 2) + 2));
                    readByte2 = -1;
                }
                if (readByte2 == 0) {
                    for (int i12 = 0; i12 < this.localBuf.length && i12 < readByte; i12++) {
                        int readByte3 = readByte(inputStream);
                        this.pos += 2;
                        this.localBuf[i12] = (byte) readByte3;
                    }
                    this.pos = (int) (this.pos + skip(inputStream, 2L));
                    this.localPos = 0;
                    return readByte;
                }
            }
        }
    }

    private long skip(InputStream inputStream, long j) throws IOException {
        long skip = inputStream.skip(j);
        return skip < j ? inputStream.skip(j - skip) + skip : skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.available - this.bytesRead;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i3) {
        try {
            super.mark(((FilterInputStream) this).in.available());
        } catch (IOException unused) {
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        throw new UnsupportedOperationException(StubApp.getString2(26678));
    }

    public int readPacket(byte[] bArr) throws IOException {
        int i3 = 0;
        while (i3 < bArr.length) {
            int i10 = this.localPos;
            if (i10 < this.size) {
                byte[] bArr2 = this.localBuf;
                this.localPos = i10 + 1;
                bArr[i3] = bArr2[i10];
                i3++;
            } else {
                int i11 = this.bytesRead;
                int readLine = readLine();
                this.size = readLine;
                this.bytesRead = i11 + readLine;
                if (readLine == 0) {
                    break;
                }
            }
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.pos = 0;
        this.bytesRead = 0;
        this.localPos = 128;
    }

    public int sizeInBytes() {
        return this.available;
    }

    public int sizeInPackets(int i3) {
        int sizeInBytes = sizeInBytes();
        return (sizeInBytes / i3) + (sizeInBytes % i3 > 0 ? 1 : 0);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return readPacket(bArr);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i3, int i10) {
        throw new UnsupportedOperationException(StubApp.getString2(26678));
    }

    public HexInputStream(byte[] bArr, int i3) throws HexFileValidationException, IOException {
        super(new ByteArrayInputStream(bArr));
        this.LINE_LENGTH = 128;
        byte[] bArr2 = new byte[128];
        this.localBuf = bArr2;
        this.localPos = 128;
        this.size = bArr2.length;
        this.lastAddress = 0;
        this.MBRSize = i3;
        this.available = calculateBinSize(i3);
    }
}
