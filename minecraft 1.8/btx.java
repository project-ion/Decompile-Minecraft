/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Map;
/*  3:   */ 
/*  4:   */ public enum btx
/*  5:   */ {
/*  6:   */   private static final Map c;
/*  7:   */   private final String d;
/*  8:   */   
/*  9:   */   private btx(String paramString)
/* 10:   */   {
/* 11:61 */     this.d = paramString;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public static btx a(String paramString)
/* 15:   */   {
/* 16:66 */     return (btx)c.get(paramString.toLowerCase());
/* 17:   */   }
/* 18:   */   
/* 19:   */   static
/* 20:   */   {
/* 21:57 */     c = Maps.newHashMap();
/* 22:70 */     for (btx localbtx : values()) {
/* 23:71 */       c.put(localbtx.d, localbtx);
/* 24:   */     }
/* 25:   */   }
/* 26:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     btx
 * JD-Core Version:    0.7.0.1
 */