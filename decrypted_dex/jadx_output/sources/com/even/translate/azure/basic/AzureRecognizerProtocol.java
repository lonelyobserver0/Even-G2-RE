package com.even.translate.azure.basic;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/even/translate/azure/basic/AzureRecognizerProtocol;", "", "state", "Lcom/even/translate/azure/basic/AzureRecognizerState;", "getState", "()Lcom/even/translate/azure/basic/AzureRecognizerState;", "startTranslation", "", "pauseTranslation", "resumeTranslation", "stopTranslation", "close", "translate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface AzureRecognizerProtocol {
    void close() throws AzureRecognizerError;

    AzureRecognizerState getState();

    void pauseTranslation() throws AzureRecognizerError;

    void resumeTranslation() throws AzureRecognizerError;

    void startTranslation() throws AzureRecognizerError;

    void stopTranslation() throws AzureRecognizerError;
}
