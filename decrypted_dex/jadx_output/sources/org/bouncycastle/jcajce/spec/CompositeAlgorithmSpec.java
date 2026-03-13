package org.bouncycastle.jcajce.spec;

import com.stub.StubApp;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CompositeAlgorithmSpec implements AlgorithmParameterSpec {
    private final List<String> algorithmNames;
    private final List<AlgorithmParameterSpec> parameterSpecs;

    public static class Builder {
        private List<String> algorithmNames = new ArrayList();
        private List<AlgorithmParameterSpec> parameterSpecs = new ArrayList();

        public Builder add(String str) {
            this.algorithmNames.add(str);
            this.parameterSpecs.add(null);
            return this;
        }

        public CompositeAlgorithmSpec build() {
            if (this.algorithmNames.isEmpty()) {
                throw new IllegalStateException(StubApp.getString2(32436));
            }
            return new CompositeAlgorithmSpec(this);
        }

        public Builder add(String str, AlgorithmParameterSpec algorithmParameterSpec) {
            this.algorithmNames.add(str);
            this.parameterSpecs.add(algorithmParameterSpec);
            return this;
        }
    }

    public CompositeAlgorithmSpec(Builder builder) {
        this.algorithmNames = Collections.unmodifiableList(new ArrayList(builder.algorithmNames));
        this.parameterSpecs = Collections.unmodifiableList(new ArrayList(builder.parameterSpecs));
    }

    public List<String> getAlgorithmNames() {
        return this.algorithmNames;
    }

    public List<AlgorithmParameterSpec> getParameterSpecs() {
        return this.parameterSpecs;
    }
}
