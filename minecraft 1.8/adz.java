/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Map;
/*  3:   */ 
/*  4:   */ public enum adz
/*  5:   */ {
/*  6:   */   private static final Map h;
/*  7:   */   private final int i;
/*  8:   */   private final String j;
/*  9:   */   
/* 10:   */   static
/* 11:   */   {
/* 12:44 */     h = Maps.newHashMap();
/* 13:46 */     for (adz localadz : values()) {
/* 14:47 */       h.put(Integer.valueOf(localadz.a()), localadz);
/* 15:   */     }
/* 16:   */   }
/* 17:   */   
/* 18:   */   private adz(int paramInt, String paramString)
/* 19:   */   {
/* 20:55 */     this.i = paramInt;
/* 21:56 */     this.j = paramString;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public int a()
/* 25:   */   {
/* 26:60 */     return this.i;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String b()
/* 30:   */   {
/* 31:64 */     return this.j;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public static adz a(int paramInt)
/* 35:   */   {
/* 36:68 */     adz localadz = (adz)h.get(Integer.valueOf(paramInt));
/* 37:69 */     return localadz == null ? a : localadz;
/* 38:   */   }
/* 39:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     adz
 * JD-Core Version:    0.7.0.1
 */