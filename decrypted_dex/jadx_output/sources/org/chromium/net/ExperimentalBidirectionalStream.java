package org.chromium.net;

import org.chromium.net.BidirectionalStream;

@Deprecated
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class ExperimentalBidirectionalStream extends BidirectionalStream {

    @Deprecated
    public static abstract class Builder extends BidirectionalStream.Builder {
        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract Builder addHeader(String str, String str2);

        @Override // org.chromium.net.BidirectionalStream.Builder
        public Builder addRequestAnnotation(Object obj) {
            return this;
        }

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract ExperimentalBidirectionalStream build();

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract Builder delayRequestHeadersUntilFirstFlush(boolean z2);

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract Builder setHttpMethod(String str);

        @Override // org.chromium.net.BidirectionalStream.Builder
        public abstract Builder setPriority(int i3);

        @Override // org.chromium.net.BidirectionalStream.Builder
        public Builder setTrafficStatsTag(int i3) {
            return this;
        }

        @Override // org.chromium.net.BidirectionalStream.Builder
        public Builder setTrafficStatsUid(int i3) {
            return this;
        }
    }
}
