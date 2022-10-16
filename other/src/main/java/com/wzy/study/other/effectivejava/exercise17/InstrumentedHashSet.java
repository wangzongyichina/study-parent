package com.wzy.study.other.effectivejava.exercise17;

import java.util.Collection;
import java.util.HashSet;

/**
 * @Author: wangzongyi
 * @Date: 2021/12/29 23:32
 * @Desc:
 */

public class InstrumentedHashSet<E> extends HashSet<E> {

    private int addCount = 0;

    public InstrumentedHashSet() {
    }

    public InstrumentedHashSet(int initialCapacity, float loadFactor, int addCount) {
        super(initialCapacity, loadFactor);
        Boolean.getBoolean("");
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
