package com.ptg.purchase.console.resp;

import com.github.pagehelper.Page;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.List;

/**
 * @Author xuconghui
 * @Date 2020/11/7 14:07
 * @Version 1.0
 **/
@Slf4j
@ToString
public class PageResultInfo<T> implements Serializable {

    private static final long serialVersionUID = -5456061403723254353L;

    /**
     * 返回对象列表参数
     */
    private List<T> rows;

    /**
     * 列表查询总条数
     */
    private Long total;

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public static <T> PageResultInfo<T> newResInfo(Page<Object> page, List<T> resps) {
        PageResultInfo<T> pageResultInfo = new PageResultInfo();
        if (page != null) {
            pageResultInfo.setTotal(page.getTotal());
        }else{
            log.info("page is null");
            pageResultInfo.setTotal(0l);
        }
        pageResultInfo.setRows(resps);
        return pageResultInfo;
    }


}
