package com.example.java;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.stream.Collectors;
public class Permutations {
   public static Collection<String> of(String str) {
        List<String> permutations = new ArrayList<>();
        permutation("", str, permutations);
        return permutations;
    }

    public static Collection<List<Character>> guava(String str) {
      return Collections2.permutations(Lists.charactersOf(str));    
    }

    private static void permutation(String prefix, String str, Collection<String> permutations) {

        int n = str.length();
        if (n == 0) permutations.add(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), permutations);
        }
    }
}
