package rx.internal.util.unsafe;

import java.util.AbstractQueue;

/**
 * Created by stefan on 17.03.17.
 */
abstract class ConcurrentCircularArrayQueueL0Pad<E> extends AbstractQueue<E> implements MessagePassingQueue<E> {
    long p00, p01, p02, p03, p04, p05, p06, p07;
    long p30, p31, p32, p33, p34, p35, p36, p37;
}
