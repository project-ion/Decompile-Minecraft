/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ import org.apache.logging.log4j.LogManager;
/*   4:    */ import org.apache.logging.log4j.Logger;
/*   5:    */ 
/*   6:    */ public class cel
/*   7:    */   implements bfe
/*   8:    */ {
/*   9: 20 */   private static final Logger a = ;
/*  10:    */   private bfh b;
/*  11: 23 */   private ur c = new ur();
/*  12: 24 */   private List d = Lists.newArrayList();
/*  13:    */   private aqu e;
/*  14:    */   
/*  15:    */   public cel(aqu paramaqu)
/*  16:    */   {
/*  17: 28 */     this.b = new bfg(paramaqu, 0, 0);
/*  18:    */     
/*  19: 30 */     this.e = paramaqu;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public boolean a(int paramInt1, int paramInt2)
/*  23:    */   {
/*  24: 35 */     return true;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public void b(int paramInt1, int paramInt2)
/*  28:    */   {
/*  29: 39 */     bfh localbfh = d(paramInt1, paramInt2);
/*  30: 40 */     if (!localbfh.f()) {
/*  31: 41 */       localbfh.d();
/*  32:    */     }
/*  33: 44 */     this.c.d(aqm.a(paramInt1, paramInt2));
/*  34: 45 */     this.d.remove(localbfh);
/*  35:    */   }
/*  36:    */   
/*  37:    */   public bfh c(int paramInt1, int paramInt2)
/*  38:    */   {
/*  39: 50 */     bfh localbfh = new bfh(this.e, paramInt1, paramInt2);
/*  40: 51 */     this.c.a(aqm.a(paramInt1, paramInt2), localbfh);
/*  41: 52 */     this.d.add(localbfh);
/*  42: 53 */     localbfh.c(true);
/*  43:    */     
/*  44: 55 */     return localbfh;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public bfh d(int paramInt1, int paramInt2)
/*  48:    */   {
/*  49: 60 */     bfh localbfh = (bfh)this.c.a(aqm.a(paramInt1, paramInt2));
/*  50: 61 */     if (localbfh == null) {
/*  51: 62 */       return this.b;
/*  52:    */     }
/*  53: 65 */     return localbfh;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public boolean a(boolean paramBoolean, uy paramuy)
/*  57:    */   {
/*  58: 70 */     return true;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void c() {}
/*  62:    */   
/*  63:    */   public boolean d()
/*  64:    */   {
/*  65: 79 */     long l = System.currentTimeMillis();
/*  66: 81 */     for (bfh localbfh : this.d) {
/*  67: 82 */       localbfh.b(System.currentTimeMillis() - l > 5L);
/*  68:    */     }
/*  69: 84 */     if (System.currentTimeMillis() - l > 100L) {
/*  70: 85 */       a.info("Warning: Clientside chunk ticking took {} ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
/*  71:    */     }
/*  72: 87 */     return false;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public boolean e()
/*  76:    */   {
/*  77: 92 */     return false;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void a(bfe parambfe, int paramInt1, int paramInt2) {}
/*  81:    */   
/*  82:    */   public boolean a(bfe parambfe, bfh parambfh, int paramInt1, int paramInt2)
/*  83:    */   {
/*  84:101 */     return false;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String f()
/*  88:    */   {
/*  89:106 */     return "MultiplayerChunkCache: " + this.c.a() + ", " + this.d.size();
/*  90:    */   }
/*  91:    */   
/*  92:    */   public List a(xp paramxp, dt paramdt)
/*  93:    */   {
/*  94:111 */     return null;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public dt a(aqu paramaqu, String paramString, dt paramdt)
/*  98:    */   {
/*  99:116 */     return null;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public int g()
/* 103:    */   {
/* 104:121 */     return this.d.size();
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void a(bfh parambfh, int paramInt1, int paramInt2) {}
/* 108:    */   
/* 109:    */   public bfh a(dt paramdt)
/* 110:    */   {
/* 111:130 */     return d(paramdt.n() >> 4, paramdt.p() >> 4);
/* 112:    */   }
/* 113:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cel
 * JD-Core Version:    0.7.0.1
 */