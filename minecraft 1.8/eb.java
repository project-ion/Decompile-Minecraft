/*  1:   */ import com.google.common.collect.Iterables;
/*  2:   */ import com.google.common.collect.Lists;
/*  3:   */ import java.lang.reflect.Array;
/*  4:   */ import java.util.ArrayList;
/*  5:   */ import java.util.List;
/*  6:   */ 
/*  7:   */ public class eb
/*  8:   */ {
/*  9:   */   public static Iterable a(Class paramClass, Iterable paramIterable)
/* 10:   */   {
/* 11:13 */     return new ee(paramClass, (Iterable[])b(Iterable.class, paramIterable), null);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public static Iterable a(Iterable paramIterable)
/* 15:   */   {
/* 16:21 */     return b(a(Object.class, paramIterable));
/* 17:   */   }
/* 18:   */   
/* 19:   */   private static Iterable b(Iterable paramIterable)
/* 20:   */   {
/* 21:29 */     return Iterables.transform(paramIterable, new ed(null));
/* 22:   */   }
/* 23:   */   
/* 24:   */   private static Object[] b(Class paramClass, Iterable paramIterable)
/* 25:   */   {
/* 26:33 */     ArrayList localArrayList = Lists.newArrayList();
/* 27:34 */     for (Object localObject : paramIterable) {
/* 28:35 */       localArrayList.add(localObject);
/* 29:   */     }
/* 30:38 */     return (Object[])localArrayList.toArray(b(paramClass, localArrayList.size()));
/* 31:   */   }
/* 32:   */   
/* 33:   */   private static Object[] b(Class paramClass, int paramInt)
/* 34:   */   {
/* 35:43 */     return (Object[])Array.newInstance(paramClass, paramInt);
/* 36:   */   }
/* 37:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     eb
 * JD-Core Version:    0.7.0.1
 */