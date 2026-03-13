package no.nordicsemi.android.dfu.internal;

import android.util.Log;
import com.google.gson.Gson;
import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.UByte;
import no.nordicsemi.android.dfu.internal.manifest.Manifest;
import no.nordicsemi.android.dfu.internal.manifest.ManifestFile;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ArchiveInputStream extends InputStream {
    private static final String APPLICATION_BIN = StubApp.getString2(26660);
    private static final String APPLICATION_HEX = StubApp.getString2(26659);
    private static final String APPLICATION_INIT = StubApp.getString2(26661);
    private static final String BOOTLOADER_BIN = StubApp.getString2(26664);
    private static final String BOOTLOADER_HEX = StubApp.getString2(26663);
    private static final String MANIFEST = StubApp.getString2(26672);
    private static final String SOFTDEVICE_BIN = StubApp.getString2(26666);
    private static final String SOFTDEVICE_HEX = StubApp.getString2(26665);
    private static final String SYSTEM_INIT = StubApp.getString2(26662);
    private static final String TAG = StubApp.getString2(26670);
    private byte[] applicationBytes;
    private byte[] applicationInitBytes;
    private int applicationSize;
    private byte[] bootloaderBytes;
    private int bootloaderSize;
    private int bytesRead;
    private int bytesReadFromCurrentSource;
    private int bytesReadFromMarkedSource;
    private final CRC32 crc32;
    private byte[] currentSource;
    private final Map<String, byte[]> entries;
    private Manifest manifest;
    private byte[] markedSource;
    private byte[] softDeviceAndBootloaderBytes;
    private byte[] softDeviceBytes;
    private int softDeviceSize;
    private byte[] systemInitBytes;
    private int type;
    private final ZipInputStream zipInputStream;

    /* JADX WARN: Removed duplicated region for block: B:81:0x0292 A[Catch: all -> 0x0080, TRY_ENTER, TryCatch #0 {all -> 0x0080, blocks: (B:5:0x0041, B:7:0x0049, B:13:0x0057, B:15:0x0079, B:16:0x009d, B:19:0x00a7, B:21:0x00ab, B:23:0x00af, B:25:0x00d1, B:26:0x00d8, B:27:0x00f0, B:29:0x00f1, B:30:0x00fc, B:31:0x00fd, B:34:0x0107, B:36:0x010b, B:38:0x012d, B:39:0x0134, B:40:0x014c, B:41:0x014d, B:44:0x0157, B:46:0x015b, B:48:0x015f, B:50:0x0163, B:52:0x0185, B:55:0x0285, B:58:0x01c0, B:59:0x01cb, B:60:0x0196, B:61:0x01ae, B:62:0x01af, B:63:0x01ba, B:65:0x0083, B:66:0x009b, B:69:0x01ce, B:77:0x024d, B:81:0x0292, B:82:0x029d, B:83:0x0250, B:85:0x0260, B:86:0x026e, B:88:0x0272, B:89:0x0219, B:91:0x0229, B:92:0x0237, B:94:0x023b, B:95:0x01d2, B:97:0x01e2, B:98:0x01f0, B:100:0x01f4), top: B:4:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0260 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:5:0x0041, B:7:0x0049, B:13:0x0057, B:15:0x0079, B:16:0x009d, B:19:0x00a7, B:21:0x00ab, B:23:0x00af, B:25:0x00d1, B:26:0x00d8, B:27:0x00f0, B:29:0x00f1, B:30:0x00fc, B:31:0x00fd, B:34:0x0107, B:36:0x010b, B:38:0x012d, B:39:0x0134, B:40:0x014c, B:41:0x014d, B:44:0x0157, B:46:0x015b, B:48:0x015f, B:50:0x0163, B:52:0x0185, B:55:0x0285, B:58:0x01c0, B:59:0x01cb, B:60:0x0196, B:61:0x01ae, B:62:0x01af, B:63:0x01ba, B:65:0x0083, B:66:0x009b, B:69:0x01ce, B:77:0x024d, B:81:0x0292, B:82:0x029d, B:83:0x0250, B:85:0x0260, B:86:0x026e, B:88:0x0272, B:89:0x0219, B:91:0x0229, B:92:0x0237, B:94:0x023b, B:95:0x01d2, B:97:0x01e2, B:98:0x01f0, B:100:0x01f4), top: B:4:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0272 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:5:0x0041, B:7:0x0049, B:13:0x0057, B:15:0x0079, B:16:0x009d, B:19:0x00a7, B:21:0x00ab, B:23:0x00af, B:25:0x00d1, B:26:0x00d8, B:27:0x00f0, B:29:0x00f1, B:30:0x00fc, B:31:0x00fd, B:34:0x0107, B:36:0x010b, B:38:0x012d, B:39:0x0134, B:40:0x014c, B:41:0x014d, B:44:0x0157, B:46:0x015b, B:48:0x015f, B:50:0x0163, B:52:0x0185, B:55:0x0285, B:58:0x01c0, B:59:0x01cb, B:60:0x0196, B:61:0x01ae, B:62:0x01af, B:63:0x01ba, B:65:0x0083, B:66:0x009b, B:69:0x01ce, B:77:0x024d, B:81:0x0292, B:82:0x029d, B:83:0x0250, B:85:0x0260, B:86:0x026e, B:88:0x0272, B:89:0x0219, B:91:0x0229, B:92:0x0237, B:94:0x023b, B:95:0x01d2, B:97:0x01e2, B:98:0x01f0, B:100:0x01f4), top: B:4:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0229 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:5:0x0041, B:7:0x0049, B:13:0x0057, B:15:0x0079, B:16:0x009d, B:19:0x00a7, B:21:0x00ab, B:23:0x00af, B:25:0x00d1, B:26:0x00d8, B:27:0x00f0, B:29:0x00f1, B:30:0x00fc, B:31:0x00fd, B:34:0x0107, B:36:0x010b, B:38:0x012d, B:39:0x0134, B:40:0x014c, B:41:0x014d, B:44:0x0157, B:46:0x015b, B:48:0x015f, B:50:0x0163, B:52:0x0185, B:55:0x0285, B:58:0x01c0, B:59:0x01cb, B:60:0x0196, B:61:0x01ae, B:62:0x01af, B:63:0x01ba, B:65:0x0083, B:66:0x009b, B:69:0x01ce, B:77:0x024d, B:81:0x0292, B:82:0x029d, B:83:0x0250, B:85:0x0260, B:86:0x026e, B:88:0x0272, B:89:0x0219, B:91:0x0229, B:92:0x0237, B:94:0x023b, B:95:0x01d2, B:97:0x01e2, B:98:0x01f0, B:100:0x01f4), top: B:4:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023b A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:5:0x0041, B:7:0x0049, B:13:0x0057, B:15:0x0079, B:16:0x009d, B:19:0x00a7, B:21:0x00ab, B:23:0x00af, B:25:0x00d1, B:26:0x00d8, B:27:0x00f0, B:29:0x00f1, B:30:0x00fc, B:31:0x00fd, B:34:0x0107, B:36:0x010b, B:38:0x012d, B:39:0x0134, B:40:0x014c, B:41:0x014d, B:44:0x0157, B:46:0x015b, B:48:0x015f, B:50:0x0163, B:52:0x0185, B:55:0x0285, B:58:0x01c0, B:59:0x01cb, B:60:0x0196, B:61:0x01ae, B:62:0x01af, B:63:0x01ba, B:65:0x0083, B:66:0x009b, B:69:0x01ce, B:77:0x024d, B:81:0x0292, B:82:0x029d, B:83:0x0250, B:85:0x0260, B:86:0x026e, B:88:0x0272, B:89:0x0219, B:91:0x0229, B:92:0x0237, B:94:0x023b, B:95:0x01d2, B:97:0x01e2, B:98:0x01f0, B:100:0x01f4), top: B:4:0x0041 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ArchiveInputStream(java.io.InputStream r10, int r11, int r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: no.nordicsemi.android.dfu.internal.ArchiveInputStream.<init>(java.io.InputStream, int, int):void");
    }

    private void parseZip(int i3) throws IOException {
        String string2;
        byte[] bArr = new byte[1024];
        String str = null;
        while (true) {
            ZipEntry nextEntry = this.zipInputStream.getNextEntry();
            string2 = StubApp.getString2(26670);
            if (nextEntry == null) {
                break;
            }
            String validateFilename = validateFilename(nextEntry.getName(), StubApp.getString2(1));
            if (nextEntry.isDirectory()) {
                Log.w(string2, StubApp.getString2(26671) + validateFilename + StubApp.getString2(1373));
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int read = this.zipInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (validateFilename.toLowerCase(Locale.US).endsWith(StubApp.getString2(26413))) {
                    HexInputStream hexInputStream = new HexInputStream(byteArray, i3);
                    byteArray = new byte[hexInputStream.available()];
                    hexInputStream.read(byteArray);
                    hexInputStream.close();
                }
                if (StubApp.getString2(26672).equals(validateFilename)) {
                    str = new String(byteArray, StandardCharsets.UTF_8);
                } else {
                    this.entries.put(validateFilename, byteArray);
                }
            }
        }
        if (this.entries.isEmpty()) {
            throw new FileNotFoundException(StubApp.getString2(26675));
        }
        if (str == null) {
            Log.w(string2, StubApp.getString2(26674));
            return;
        }
        Manifest manifest = ((ManifestFile) new Gson().fromJson(str, ManifestFile.class)).getManifest();
        this.manifest = manifest;
        if (manifest == null) {
            Log.w(string2, StubApp.getString2(26673));
        }
    }

    private int rawRead(byte[] bArr, int i3, int i10) {
        byte[] bArr2 = this.currentSource;
        if (bArr2 == null || i3 < 0 || i10 < 0) {
            return -1;
        }
        int min = Math.min(i10, bArr2.length - this.bytesReadFromCurrentSource);
        System.arraycopy(this.currentSource, this.bytesReadFromCurrentSource, bArr, i3, min);
        this.bytesReadFromCurrentSource += min;
        this.bytesRead += min;
        this.crc32.update(bArr, i3, min);
        return min;
    }

    private byte[] startNextFile() {
        byte[] bArr;
        byte[] bArr2 = this.currentSource;
        if (bArr2 != this.softDeviceBytes || (bArr = this.bootloaderBytes) == null || (this.type & 2) <= 0) {
            bArr = this.applicationBytes;
            if (bArr2 == bArr || bArr == null || (this.type & 4) <= 0) {
                bArr = null;
                this.currentSource = null;
            } else {
                this.currentSource = bArr;
            }
        } else {
            this.currentSource = bArr;
        }
        this.bytesReadFromCurrentSource = 0;
        return bArr;
    }

    private String validateFilename(String str, String str2) throws IOException {
        String canonicalPath = new File(str).getCanonicalPath();
        if (canonicalPath.startsWith(new File(str2).getCanonicalPath())) {
            return canonicalPath.substring(1);
        }
        throw new IllegalStateException(StubApp.getString2(26676));
    }

    public int applicationImageSize() {
        if ((this.type & 4) > 0) {
            return this.applicationSize;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int available() {
        byte[] bArr = this.softDeviceAndBootloaderBytes;
        if (bArr != null && this.softDeviceSize == 0 && this.bootloaderSize == 0 && (this.type & 3) > 0) {
            return (applicationImageSize() + bArr.length) - this.bytesRead;
        }
        return (applicationImageSize() + (bootloaderImageSize() + softDeviceImageSize())) - this.bytesRead;
    }

    public int bootloaderImageSize() {
        if ((this.type & 2) > 0) {
            return this.bootloaderSize;
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.softDeviceBytes = null;
        this.bootloaderBytes = null;
        this.applicationBytes = null;
        this.softDeviceAndBootloaderBytes = null;
        this.applicationSize = 0;
        this.bootloaderSize = 0;
        this.softDeviceSize = 0;
        this.currentSource = null;
        this.bytesReadFromCurrentSource = 0;
        this.bytesRead = 0;
        this.zipInputStream.close();
    }

    public void fullReset() {
        byte[] bArr;
        byte[] bArr2 = this.softDeviceBytes;
        if (bArr2 != null && (bArr = this.bootloaderBytes) != null && this.currentSource == bArr) {
            this.currentSource = bArr2;
        }
        this.bytesReadFromCurrentSource = 0;
        mark(0);
        reset();
    }

    public byte[] getApplicationInit() {
        return this.applicationInitBytes;
    }

    public int getBytesRead() {
        return this.bytesRead;
    }

    public int getContentType() {
        this.type = 0;
        if (this.softDeviceAndBootloaderBytes != null) {
            this.type = 3;
        }
        if (this.softDeviceSize > 0) {
            this.type |= 1;
        }
        if (this.bootloaderSize > 0) {
            this.type |= 2;
        }
        if (this.applicationSize > 0) {
            this.type |= 4;
        }
        return this.type;
    }

    public long getCrc32() {
        return this.crc32.getValue();
    }

    public byte[] getSystemInit() {
        return this.systemInitBytes;
    }

    public boolean isSecureDfuRequired() {
        Manifest manifest = this.manifest;
        return manifest != null && manifest.isSecureDfuRequired();
    }

    @Override // java.io.InputStream
    public void mark(int i3) {
        this.markedSource = this.currentSource;
        this.bytesReadFromMarkedSource = this.bytesReadFromCurrentSource;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public void reset() {
        int i3;
        byte[] bArr;
        this.currentSource = this.markedSource;
        int i10 = this.bytesReadFromMarkedSource;
        this.bytesReadFromCurrentSource = i10;
        this.bytesRead = i10;
        this.crc32.reset();
        if (this.currentSource == this.bootloaderBytes && (bArr = this.softDeviceBytes) != null) {
            this.crc32.update(bArr);
            this.bytesRead += this.softDeviceSize;
        }
        byte[] bArr2 = this.currentSource;
        if (bArr2 == null || (i3 = this.bytesReadFromCurrentSource) <= 0) {
            return;
        }
        this.crc32.update(bArr2, 0, i3);
    }

    public int setContentType(int i3) {
        byte[] bArr;
        this.type = i3;
        int i10 = i3 & 4;
        if (i10 > 0 && this.applicationBytes == null) {
            this.type = i3 & (-5);
        }
        int i11 = i3 & 3;
        if (i11 == 3) {
            if (this.softDeviceBytes == null && this.softDeviceAndBootloaderBytes == null) {
                this.type &= -2;
            }
            if (this.bootloaderBytes == null && this.softDeviceAndBootloaderBytes == null) {
                this.type &= -2;
            }
        } else if (this.softDeviceAndBootloaderBytes != null) {
            this.type &= -4;
        }
        if (i11 > 0 && (bArr = this.softDeviceAndBootloaderBytes) != null) {
            this.currentSource = bArr;
        } else if ((i3 & 1) > 0) {
            this.currentSource = this.softDeviceBytes;
        } else if ((i3 & 2) > 0) {
            this.currentSource = this.bootloaderBytes;
        } else if (i10 > 0) {
            this.currentSource = this.applicationBytes;
        }
        this.bytesReadFromCurrentSource = 0;
        mark(0);
        reset();
        return this.type;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        return 0L;
    }

    public int softDeviceImageSize() {
        if ((this.type & 1) > 0) {
            return this.softDeviceSize;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i3, int i10) {
        int rawRead = rawRead(bArr, i3, i10);
        return (i10 <= rawRead || startNextFile() == null) ? rawRead : rawRead + rawRead(bArr, i3 + rawRead, i10 - rawRead);
    }
}
