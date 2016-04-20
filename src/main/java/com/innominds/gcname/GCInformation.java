package com.innominds.gcname;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

/**
 * It prints young generation and old generation collectors.
 *
 * @author ThirupathiReddy V
 *
 */
public class GCInformation {

    public static void main(String[] args) {
        try {
            final List<GarbageCollectorMXBean> gcMxBeans = ManagementFactory.getGarbageCollectorMXBeans();

            for (final GarbageCollectorMXBean gcMxBean : gcMxBeans) {
                System.out.println(gcMxBean.getName());
                System.out.println(gcMxBean.getObjectName());
            }

        } catch (final RuntimeException re) {
            throw re;
        } catch (final Exception exp) {
            throw new RuntimeException(exp);
        }
    }
}
