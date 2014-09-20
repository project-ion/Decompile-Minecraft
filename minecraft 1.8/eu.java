/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Iterator;
/*  3:   */ import java.util.Map;
/*  4:   */ import java.util.NoSuchElementException;
/*  5:   */ 
/*  6:   */ public class eu
/*  7:   */ {
/*  8:   */   public static Map b(Iterable paramIterable1, Iterable paramIterable2)
/*  9:   */   {
/* 10:15 */     return a(paramIterable1, paramIterable2, Maps.newLinkedHashMap());
/* 11:   */   }
/* 12:   */   
/* 13:   */   public static Map a(Iterable paramIterable1, Iterable paramIterable2, Map paramMap)
/* 14:   */   {
/* 15:19 */     Iterator localIterator1 = paramIterable2.iterator();
/* 16:20 */     for (Object localObject : paramIterable1) {
/* 17:21 */       paramMap.put(localObject, localIterator1.next());
/* 18:   */     }
/* 19:24 */     if (localIterator1.hasNext()) {
/* 20:25 */       throw new NoSuchElementException();
/* 21:   */     }
/* 22:28 */     return paramMap;
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     eu
 * JD-Core Version:    0.7.0.1
 */