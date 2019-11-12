package com.dt.common.emun;

/**
 * 类的说明
 *
 * @author Administrator - Luotuan
 * @version v1.0
 * @date 2019/11/9 0009
 * @since v1.0
 */
public enum Model {
    OBJ_MODEL(1),

    LIST_MODEL(2);

    private int model;

    private Model(int model) {
        this.model = model;
    }

    public int getModel() {
        return model;
    }

}
