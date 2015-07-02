package test;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class ClusterTest {
    public static void main(String[] args) {
        final HazelcastInstance instance1 = Hazelcast.newHazelcastInstance(new Config());
        final HazelcastInstance instance2 = Hazelcast.newHazelcastInstance(new Config());
    }
}