package com.microsoft.cognitiveservices.speech;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class KeywordRecognitionModel implements AutoCloseable {
    private boolean disposed = false;
    private SafeHandle keywordModelHandle;

    static {
        Class<?> cls = SpeechConfig.speechConfigClass;
    }

    public KeywordRecognitionModel(IntRef intRef) {
        this.keywordModelHandle = null;
        Contracts.throwIfNull(intRef, StubApp.getString2(15712));
        this.keywordModelHandle = new SafeHandle(intRef.getValue(), SafeHandleType.KeywordModel);
    }

    private static final native long createKeywordRecognitionModelFromConfig(SafeHandle safeHandle, IntRef intRef);

    private static final native long createKeywordRecognitionModelFromFile(String str, IntRef intRef);

    public static KeywordRecognitionModel fromConfig(EmbeddedSpeechConfig embeddedSpeechConfig) {
        Contracts.throwIfNull(embeddedSpeechConfig, StubApp.getString2(15706));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createKeywordRecognitionModelFromConfig(embeddedSpeechConfig.getImpl(), intRef));
        return new KeywordRecognitionModel(intRef);
    }

    public static KeywordRecognitionModel fromFile(String str) {
        Contracts.throwIfFileDoesNotExist(str, StubApp.getString2(4505));
        try {
            File file = new File(str);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(str)));
            byte[] bArr = new byte[2];
            bufferedInputStream.mark(4);
            int read = bufferedInputStream.read(bArr);
            bufferedInputStream.reset();
            boolean z2 = false;
            if (read == 2 && bArr[0] == 80 && bArr[1] == 75) {
                z2 = true;
            }
            if (z2) {
                KeywordRecognitionModel fromStream = fromStream(bufferedInputStream, file.getName(), z2);
                bufferedInputStream.close();
                return fromStream;
            }
            bufferedInputStream.close();
            IntRef intRef = new IntRef(0L);
            Contracts.throwIfFail(createKeywordRecognitionModelFromFile(file.getCanonicalPath(), intRef));
            return new KeywordRecognitionModel(intRef);
        } catch (FileNotFoundException unused) {
            throw new IllegalArgumentException(StubApp.getString2(15714));
        } catch (IOException e10) {
            throw new IllegalArgumentException(StubApp.getString2(15713) + e10.toString());
        }
    }

    public static KeywordRecognitionModel fromStream(InputStream inputStream, String str, boolean z2) throws IOException {
        Contracts.throwIfNull(inputStream, StubApp.getString2(15715));
        Contracts.throwIfNullOrWhitespace(str, StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
        if (str.contains(File.separator) || str.contains(StubApp.getString2(1)) || str.contains(StubApp.getString2(478))) {
            throw new IOException(StubApp.getString2(15729));
        }
        String property = System.getProperty(StubApp.getString2(15716));
        Contracts.throwIfNullOrWhitespace(property, StubApp.getString2(15717));
        String canonicalPath = new File(property).getCanonicalPath();
        Contracts.throwIfNullOrWhitespace(canonicalPath, StubApp.getString2(15718));
        File canonicalFile = new File(canonicalPath, StubApp.getString2(15719).concat(str)).getCanonicalFile();
        if (!canonicalFile.getCanonicalPath().startsWith(canonicalPath)) {
            throw new IOException(StubApp.getString2(15728) + canonicalFile.getCanonicalPath());
        }
        boolean exists = canonicalFile.exists();
        String string2 = StubApp.getString2(15720);
        if (!exists) {
            if (!canonicalFile.mkdirs()) {
                throw new IllegalArgumentException(StubApp.getString2(15726));
            }
            canonicalFile.deleteOnExit();
            if (!canonicalFile.isDirectory()) {
                throw new IllegalArgumentException(StubApp.getString2(15725));
            }
            byte[] bArr = new byte[PKIFailureInfo.badCertTemplate];
            FileOutputStream fileOutputStream = null;
            if (z2) {
                ZipInputStream zipInputStream = new ZipInputStream(inputStream);
                while (true) {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        zipInputStream.close();
                        break;
                    }
                    if (!nextEntry.isDirectory()) {
                        String str2 = "";
                        String str3 = "" + nextEntry.getName();
                        if (str3.length() <= 128 && !str3.contains(StubApp.getString2(15721))) {
                            str2 = str3;
                        }
                        Contracts.throwIfNullOrWhitespace(str2, StubApp.getString2(15722));
                        File file = new File(canonicalFile, str2);
                        if (!file.getCanonicalPath().startsWith(canonicalFile.getCanonicalPath())) {
                            throw new IOException(StubApp.getString2(15724) + file.getCanonicalPath());
                        }
                        if (file.exists() && !file.delete()) {
                            throw new IllegalArgumentException(StubApp.getString2(15723) + file.getCanonicalPath());
                        }
                        file.deleteOnExit();
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                            while (true) {
                                try {
                                    int read = zipInputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    fileOutputStream2.write(bArr, 0, read);
                                } catch (Throwable th) {
                                    th = th;
                                    fileOutputStream = fileOutputStream2;
                                    safeClose(fileOutputStream);
                                    throw th;
                                }
                            }
                            safeClose(fileOutputStream2);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            } else {
                try {
                    FileOutputStream fileOutputStream3 = new FileOutputStream(new File(canonicalFile, string2));
                    while (true) {
                        try {
                            int read2 = inputStream.read(bArr);
                            if (read2 <= 0) {
                                break;
                            }
                            fileOutputStream3.write(bArr, 0, read2);
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream = fileOutputStream3;
                            safeClose(fileOutputStream);
                            throw th;
                        }
                    }
                    safeClose(fileOutputStream3);
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        File file2 = new File(canonicalFile, string2);
        if (!file2.exists() || !file2.isFile()) {
            throw new IllegalArgumentException(StubApp.getString2(15727));
        }
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createKeywordRecognitionModelFromFile(file2.getCanonicalPath(), intRef));
        return new KeywordRecognitionModel(intRef);
    }

    private static final native long keywordRecognitionModelAddUserDefinedWakeWord(SafeHandle safeHandle, String str);

    private static void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.disposed) {
            return;
        }
        SafeHandle safeHandle = this.keywordModelHandle;
        if (safeHandle != null) {
            safeHandle.close();
            this.keywordModelHandle = null;
        }
        this.disposed = true;
    }

    public SafeHandle getImpl() {
        return this.keywordModelHandle;
    }

    public static KeywordRecognitionModel fromConfig(EmbeddedSpeechConfig embeddedSpeechConfig, List<String> list) {
        Contracts.throwIfNull(embeddedSpeechConfig, StubApp.getString2(15706));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(createKeywordRecognitionModelFromConfig(embeddedSpeechConfig.getImpl(), intRef));
        KeywordRecognitionModel keywordRecognitionModel = new KeywordRecognitionModel(intRef);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            Contracts.throwIfFail(keywordRecognitionModelAddUserDefinedWakeWord(keywordRecognitionModel.getImpl(), it.next()));
        }
        return keywordRecognitionModel;
    }
}
