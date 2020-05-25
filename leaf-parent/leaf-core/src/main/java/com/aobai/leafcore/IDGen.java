package com.aobai.leafcore;

import com.aobai.leafcore.common.Result;

public interface IDGen {
    Result get(String key);
    boolean init();
}
