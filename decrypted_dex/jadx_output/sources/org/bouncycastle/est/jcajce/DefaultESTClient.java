package org.bouncycastle.est.jcajce;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import org.bouncycastle.est.ESTClient;
import org.bouncycastle.est.ESTClientSourceProvider;
import org.bouncycastle.est.ESTException;
import org.bouncycastle.est.ESTRequest;
import org.bouncycastle.est.ESTRequestBuilder;
import org.bouncycastle.est.ESTResponse;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DefaultESTClient implements ESTClient {
    private final ESTClientSourceProvider sslSocketProvider;
    private static final Charset utf8 = Charset.forName(StubApp.getString2(640));
    private static byte[] CRLF = {13, 10};

    public static class PrintingOutputStream extends OutputStream {
        private final OutputStream tgt;

        public PrintingOutputStream(OutputStream outputStream) {
            this.tgt = outputStream;
        }

        @Override // java.io.OutputStream
        public void write(int i3) throws IOException {
            System.out.print(String.valueOf((char) i3));
            this.tgt.write(i3);
        }
    }

    public DefaultESTClient(ESTClientSourceProvider eSTClientSourceProvider) {
        this.sslSocketProvider = eSTClientSourceProvider;
    }

    private static void writeLine(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes());
        outputStream.write(CRLF);
    }

    @Override // org.bouncycastle.est.ESTClient
    public ESTResponse doRequest(ESTRequest eSTRequest) throws IOException {
        ESTResponse performRequest;
        int i3 = 15;
        while (true) {
            performRequest = performRequest(eSTRequest);
            ESTRequest redirectURL = redirectURL(performRequest);
            if (redirectURL == null || i3 - 1 <= 0) {
                break;
            }
            eSTRequest = redirectURL;
        }
        if (i3 != 0) {
            return performRequest;
        }
        throw new ESTException(StubApp.getString2(29535));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0008, B:5:0x0024, B:6:0x0030, B:8:0x0046, B:11:0x0053, B:12:0x0061, B:14:0x007b, B:15:0x0086, B:17:0x009c, B:18:0x00a5, B:21:0x00b7, B:22:0x00d1, B:23:0x00da, B:24:0x0112, B:26:0x0118, B:27:0x0125, B:29:0x0128, B:32:0x014e, B:34:0x0162, B:40:0x0172, B:42:0x00d5, B:44:0x0058), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009c A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0008, B:5:0x0024, B:6:0x0030, B:8:0x0046, B:11:0x0053, B:12:0x0061, B:14:0x007b, B:15:0x0086, B:17:0x009c, B:18:0x00a5, B:21:0x00b7, B:22:0x00d1, B:23:0x00da, B:24:0x0112, B:26:0x0118, B:27:0x0125, B:29:0x0128, B:32:0x014e, B:34:0x0162, B:40:0x0172, B:42:0x00d5, B:44:0x0058), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7 A[Catch: all -> 0x002d, TRY_ENTER, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0008, B:5:0x0024, B:6:0x0030, B:8:0x0046, B:11:0x0053, B:12:0x0061, B:14:0x007b, B:15:0x0086, B:17:0x009c, B:18:0x00a5, B:21:0x00b7, B:22:0x00d1, B:23:0x00da, B:24:0x0112, B:26:0x0118, B:27:0x0125, B:29:0x0128, B:32:0x014e, B:34:0x0162, B:40:0x0172, B:42:0x00d5, B:44:0x0058), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0118 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0008, B:5:0x0024, B:6:0x0030, B:8:0x0046, B:11:0x0053, B:12:0x0061, B:14:0x007b, B:15:0x0086, B:17:0x009c, B:18:0x00a5, B:21:0x00b7, B:22:0x00d1, B:23:0x00da, B:24:0x0112, B:26:0x0118, B:27:0x0125, B:29:0x0128, B:32:0x014e, B:34:0x0162, B:40:0x0172, B:42:0x00d5, B:44:0x0058), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0162 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0008, B:5:0x0024, B:6:0x0030, B:8:0x0046, B:11:0x0053, B:12:0x0061, B:14:0x007b, B:15:0x0086, B:17:0x009c, B:18:0x00a5, B:21:0x00b7, B:22:0x00d1, B:23:0x00da, B:24:0x0112, B:26:0x0118, B:27:0x0125, B:29:0x0128, B:32:0x014e, B:34:0x0162, B:40:0x0172, B:42:0x00d5, B:44:0x0058), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0172 A[Catch: all -> 0x002d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0008, B:5:0x0024, B:6:0x0030, B:8:0x0046, B:11:0x0053, B:12:0x0061, B:14:0x007b, B:15:0x0086, B:17:0x009c, B:18:0x00a5, B:21:0x00b7, B:22:0x00d1, B:23:0x00da, B:24:0x0112, B:26:0x0118, B:27:0x0125, B:29:0x0128, B:32:0x014e, B:34:0x0162, B:40:0x0172, B:42:0x00d5, B:44:0x0058), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:3:0x0008, B:5:0x0024, B:6:0x0030, B:8:0x0046, B:11:0x0053, B:12:0x0061, B:14:0x007b, B:15:0x0086, B:17:0x009c, B:18:0x00a5, B:21:0x00b7, B:22:0x00d1, B:23:0x00da, B:24:0x0112, B:26:0x0118, B:27:0x0125, B:29:0x0128, B:32:0x014e, B:34:0x0162, B:40:0x0172, B:42:0x00d5, B:44:0x0058), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.bouncycastle.est.ESTResponse performRequest(org.bouncycastle.est.ESTRequest r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.est.jcajce.DefaultESTClient.performRequest(org.bouncycastle.est.ESTRequest):org.bouncycastle.est.ESTResponse");
    }

    public ESTRequest redirectURL(ESTResponse eSTResponse) throws IOException {
        ESTRequest eSTRequest;
        ESTRequestBuilder withURL;
        if (eSTResponse.getStatusCode() < 300 || eSTResponse.getStatusCode() > 399) {
            eSTRequest = null;
        } else {
            switch (eSTResponse.getStatusCode()) {
                case 301:
                case 302:
                case 303:
                case 306:
                case 307:
                    String header = eSTResponse.getHeader(StubApp.getString2(398));
                    if (!"".equals(header)) {
                        ESTRequestBuilder eSTRequestBuilder = new ESTRequestBuilder(eSTResponse.getOriginalRequest());
                        if (header.startsWith(StubApp.getString2(3589))) {
                            withURL = eSTRequestBuilder.withURL(new URL(header));
                        } else {
                            URL url = eSTResponse.getOriginalRequest().getURL();
                            withURL = eSTRequestBuilder.withURL(new URL(url.getProtocol(), url.getHost(), url.getPort(), header));
                        }
                        eSTRequest = withURL.build();
                        break;
                    } else {
                        throw new ESTException(StubApp.getString2(29538) + eSTResponse.getStatusCode() + StubApp.getString2(29539));
                    }
                case 304:
                case 305:
                default:
                    throw new ESTException(StubApp.getString2(29537) + eSTResponse.getStatusCode());
            }
        }
        if (eSTRequest != null) {
            eSTResponse.close();
        }
        return eSTRequest;
    }
}
