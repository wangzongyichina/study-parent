package com.wzy.study.other.effectivejava.exercise17;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: wangzongyi
 * @Date: 2021/12/29 23:32
 * @Desc:
 */

public class ImproveInstrumentedHashSet<E> extends ForwardingSet<E> {

    private int addCount = 0;

    public ImproveInstrumentedHashSet(Set<E> s) {
        super(s);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

}
