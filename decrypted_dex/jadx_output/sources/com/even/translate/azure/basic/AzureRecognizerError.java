package com.even.translate.azure.basic;

import E1.a;
import com.stub.StubApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000b\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u000b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/even/translate/azure/basic/AzureRecognizerError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "InitStreamFormatError", "InitInputStreamError", "InitTranslationConfigError", "InitSpeechConfigError", "FlutterBinaryMessengerError", "StateError", "ConfigError", "StartTranslationError", "PauseTranslationError", "ResumeTranslationError", "StopTranslationError", "Lcom/even/translate/azure/basic/AzureRecognizerError$ConfigError;", "Lcom/even/translate/azure/basic/AzureRecognizerError$FlutterBinaryMessengerError;", "Lcom/even/translate/azure/basic/AzureRecognizerError$InitInputStreamError;", "Lcom/even/translate/azure/basic/AzureRecognizerError$InitSpeechConfigError;", "Lcom/even/translate/azure/basic/AzureRecognizerError$InitStreamFormatError;", "Lcom/even/translate/azure/basic/AzureRecognizerError$InitTranslationConfigError;", "Lcom/even/translate/azure/basic/AzureRecognizerError$PauseTranslationError;", "Lcom/even/translate/azure/basic/AzureRecognizerError$ResumeTranslationError;", "Lcom/even/translate/azure/basic/AzureRecognizerError$StartTranslationError;", "Lcom/even/translate/azure/basic/AzureRecognizerError$StateError;", "Lcom/even/translate/azure/basic/AzureRecognizerError$StopTranslationError;", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AzureRecognizerError extends Exception {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/even/translate/azure/basic/AzureRecognizerError$ConfigError;", "Lcom/even/translate/azure/basic/AzureRecognizerError;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "message", "getMessage", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConfigError extends AzureRecognizerError {
        private final String errorMessage;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfigError(String errorMessage) {
            super(null);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            this.message = a.j(StubApp.getString2(10105), errorMessage);
        }

        public static /* synthetic */ ConfigError copy$default(ConfigError configError, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = configError.errorMessage;
            }
            return configError.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final ConfigError copy(String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new ConfigError(errorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConfigError) && Intrinsics.areEqual(this.errorMessage, ((ConfigError) other).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return a.k(StubApp.getString2(6494), this.errorMessage, StubApp.getString2(74));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/even/translate/azure/basic/AzureRecognizerError$FlutterBinaryMessengerError;", "Lcom/even/translate/azure/basic/AzureRecognizerError;", "<init>", "()V", "message", "", "getMessage", "()Ljava/lang/String;", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FlutterBinaryMessengerError extends AzureRecognizerError {
        public static final FlutterBinaryMessengerError INSTANCE = new FlutterBinaryMessengerError();
        private static final String message = StubApp.getString2(10106);

        private FlutterBinaryMessengerError() {
            super(null);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/even/translate/azure/basic/AzureRecognizerError$InitInputStreamError;", "Lcom/even/translate/azure/basic/AzureRecognizerError;", "<init>", "()V", "message", "", "getMessage", "()Ljava/lang/String;", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InitInputStreamError extends AzureRecognizerError {
        public static final InitInputStreamError INSTANCE = new InitInputStreamError();
        private static final String message = StubApp.getString2(10107);

        private InitInputStreamError() {
            super(null);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/even/translate/azure/basic/AzureRecognizerError$InitSpeechConfigError;", "Lcom/even/translate/azure/basic/AzureRecognizerError;", "<init>", "()V", "message", "", "getMessage", "()Ljava/lang/String;", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InitSpeechConfigError extends AzureRecognizerError {
        public static final InitSpeechConfigError INSTANCE = new InitSpeechConfigError();
        private static final String message = StubApp.getString2(10108);

        private InitSpeechConfigError() {
            super(null);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/even/translate/azure/basic/AzureRecognizerError$InitStreamFormatError;", "Lcom/even/translate/azure/basic/AzureRecognizerError;", "<init>", "()V", "message", "", "getMessage", "()Ljava/lang/String;", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InitStreamFormatError extends AzureRecognizerError {
        public static final InitStreamFormatError INSTANCE = new InitStreamFormatError();
        private static final String message = StubApp.getString2(10109);

        private InitStreamFormatError() {
            super(null);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/even/translate/azure/basic/AzureRecognizerError$InitTranslationConfigError;", "Lcom/even/translate/azure/basic/AzureRecognizerError;", "<init>", "()V", "message", "", "getMessage", "()Ljava/lang/String;", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InitTranslationConfigError extends AzureRecognizerError {
        public static final InitTranslationConfigError INSTANCE = new InitTranslationConfigError();
        private static final String message = StubApp.getString2(10110);

        private InitTranslationConfigError() {
            super(null);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/even/translate/azure/basic/AzureRecognizerError$PauseTranslationError;", "Lcom/even/translate/azure/basic/AzureRecognizerError;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "message", "getMessage", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PauseTranslationError extends AzureRecognizerError {
        private final String errorMessage;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PauseTranslationError(String errorMessage) {
            super(null);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            this.message = a.j(StubApp.getString2(6495), errorMessage);
        }

        public static /* synthetic */ PauseTranslationError copy$default(PauseTranslationError pauseTranslationError, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = pauseTranslationError.errorMessage;
            }
            return pauseTranslationError.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final PauseTranslationError copy(String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new PauseTranslationError(errorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PauseTranslationError) && Intrinsics.areEqual(this.errorMessage, ((PauseTranslationError) other).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return a.k(StubApp.getString2(6496), this.errorMessage, StubApp.getString2(74));
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/even/translate/azure/basic/AzureRecognizerError$ResumeTranslationError;", "Lcom/even/translate/azure/basic/AzureRecognizerError;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "message", "getMessage", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ResumeTranslationError extends AzureRecognizerError {
        private final String errorMessage;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResumeTranslationError(String errorMessage) {
            super(null);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            this.message = a.j(StubApp.getString2(6497), errorMessage);
        }

        public static /* synthetic */ ResumeTranslationError copy$default(ResumeTranslationError resumeTranslationError, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = resumeTranslationError.errorMessage;
            }
            return resumeTranslationError.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final ResumeTranslationError copy(String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new ResumeTranslationError(errorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ResumeTranslationError) && Intrinsics.areEqual(this.errorMessage, ((ResumeTranslationError) other).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return a.k(StubApp.getString2(6498), this.errorMessage, StubApp.getString2(74));
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/even/translate/azure/basic/AzureRecognizerError$StartTranslationError;", "Lcom/even/translate/azure/basic/AzureRecognizerError;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "message", "getMessage", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StartTranslationError extends AzureRecognizerError {
        private final String errorMessage;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartTranslationError(String errorMessage) {
            super(null);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            this.message = a.j(StubApp.getString2(6499), errorMessage);
        }

        public static /* synthetic */ StartTranslationError copy$default(StartTranslationError startTranslationError, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = startTranslationError.errorMessage;
            }
            return startTranslationError.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final StartTranslationError copy(String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new StartTranslationError(errorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StartTranslationError) && Intrinsics.areEqual(this.errorMessage, ((StartTranslationError) other).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return a.k(StubApp.getString2(6500), this.errorMessage, StubApp.getString2(74));
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J/\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/even/translate/azure/basic/AzureRecognizerError$StateError;", "Lcom/even/translate/azure/basic/AzureRecognizerError;", "currentState", "Lcom/even/translate/azure/basic/AzureRecognizerState;", "expectedStates", "", "errorMessage", "", "<init>", "(Lcom/even/translate/azure/basic/AzureRecognizerState;Ljava/util/List;Ljava/lang/String;)V", "getCurrentState", "()Lcom/even/translate/azure/basic/AzureRecognizerState;", "getExpectedStates", "()Ljava/util/List;", "getErrorMessage", "()Ljava/lang/String;", "message", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StateError extends AzureRecognizerError {
        private final AzureRecognizerState currentState;
        private final String errorMessage;
        private final List<AzureRecognizerState> expectedStates;
        private final String message;

        public /* synthetic */ StateError(AzureRecognizerState azureRecognizerState, List list, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(azureRecognizerState, list, (i3 & 4) != 0 ? null : str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateError copy$default(StateError stateError, AzureRecognizerState azureRecognizerState, List list, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                azureRecognizerState = stateError.currentState;
            }
            if ((i3 & 2) != 0) {
                list = stateError.expectedStates;
            }
            if ((i3 & 4) != 0) {
                str = stateError.errorMessage;
            }
            return stateError.copy(azureRecognizerState, list, str);
        }

        /* renamed from: component1, reason: from getter */
        public final AzureRecognizerState getCurrentState() {
            return this.currentState;
        }

        public final List<AzureRecognizerState> component2() {
            return this.expectedStates;
        }

        /* renamed from: component3, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final StateError copy(AzureRecognizerState currentState, List<? extends AzureRecognizerState> expectedStates, String errorMessage) {
            Intrinsics.checkNotNullParameter(currentState, "currentState");
            Intrinsics.checkNotNullParameter(expectedStates, "expectedStates");
            return new StateError(currentState, expectedStates, errorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateError)) {
                return false;
            }
            StateError stateError = (StateError) other;
            return this.currentState == stateError.currentState && Intrinsics.areEqual(this.expectedStates, stateError.expectedStates) && Intrinsics.areEqual(this.errorMessage, stateError.errorMessage);
        }

        public final AzureRecognizerState getCurrentState() {
            return this.currentState;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final List<AzureRecognizerState> getExpectedStates() {
            return this.expectedStates;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int g10 = a.g(this.currentState.hashCode() * 31, 31, this.expectedStates);
            String str = this.errorMessage;
            return g10 + (str == null ? 0 : str.hashCode());
        }

        @Override // java.lang.Throwable
        public String toString() {
            AzureRecognizerState azureRecognizerState = this.currentState;
            List<AzureRecognizerState> list = this.expectedStates;
            String str = this.errorMessage;
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(10113));
            sb2.append(azureRecognizerState);
            sb2.append(StubApp.getString2(10114));
            sb2.append(list);
            sb2.append(StubApp.getString2(10115));
            return AbstractC1482f.k(sb2, str, StubApp.getString2(74));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StateError(AzureRecognizerState currentState, List<? extends AzureRecognizerState> expectedStates, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(currentState, "currentState");
            Intrinsics.checkNotNullParameter(expectedStates, "expectedStates");
            this.currentState = currentState;
            this.expectedStates = expectedStates;
            this.errorMessage = str;
            if (str == null) {
                str = StubApp.getString2(10111) + currentState + StubApp.getString2(10112) + expectedStates;
            }
            this.message = str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/even/translate/azure/basic/AzureRecognizerError$StopTranslationError;", "Lcom/even/translate/azure/basic/AzureRecognizerError;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "message", "getMessage", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StopTranslationError extends AzureRecognizerError {
        private final String errorMessage;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopTranslationError(String errorMessage) {
            super(null);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            this.message = a.j(StubApp.getString2(6501), errorMessage);
        }

        public static /* synthetic */ StopTranslationError copy$default(StopTranslationError stopTranslationError, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = stopTranslationError.errorMessage;
            }
            return stopTranslationError.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final StopTranslationError copy(String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new StopTranslationError(errorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StopTranslationError) && Intrinsics.areEqual(this.errorMessage, ((StopTranslationError) other).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return a.k(StubApp.getString2(6502), this.errorMessage, StubApp.getString2(74));
        }
    }

    public /* synthetic */ AzureRecognizerError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AzureRecognizerError() {
    }
}
