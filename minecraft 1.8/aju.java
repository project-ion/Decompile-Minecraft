/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class aju
/*   4:    */   extends alq
/*   5:    */ {
/*   6:    */   protected final atr a;
/*   7:    */   
/*   8:    */   public aju(atr paramatr)
/*   9:    */   {
/*  10: 24 */     this.a = paramatr;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public aju b(String paramString)
/*  14:    */   {
/*  15: 29 */     super.c(paramString);
/*  16: 30 */     return this;
/*  17:    */   }
/*  18:    */   
/*  19:    */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  20:    */   {
/*  21: 35 */     bec localbec1 = paramaqu.p(paramdt);
/*  22: 36 */     atr localatr = localbec1.c();
/*  23: 37 */     if ((localatr == aty.aH) && (((Integer)localbec1.b(bao.a)).intValue() < 1)) {
/*  24: 38 */       paramej = ej.b;
/*  25: 39 */     } else if (!localatr.f(paramaqu, paramdt)) {
/*  26: 40 */       paramdt = paramdt.a(paramej);
/*  27:    */     }
/*  28: 43 */     if (paramamj.b == 0) {
/*  29: 44 */       return false;
/*  30:    */     }
/*  31: 46 */     if (!paramahd.a(paramdt, paramej, paramamj)) {
/*  32: 47 */       return false;
/*  33:    */     }
/*  34: 50 */     if ((paramdt.o() == 255) && (this.a.r().a())) {
/*  35: 51 */       return false;
/*  36:    */     }
/*  37: 54 */     if (paramaqu.a(this.a, paramdt, false, paramej, null, paramamj))
/*  38:    */     {
/*  39: 55 */       int i = a(paramamj.i());
/*  40: 56 */       bec localbec2 = this.a.a(paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3, i, paramahd);
/*  41: 57 */       if (paramaqu.a(paramdt, localbec2, 3))
/*  42:    */       {
/*  43: 58 */         localbec2 = paramaqu.p(paramdt);
/*  44: 62 */         if (localbec2.c() == this.a)
/*  45:    */         {
/*  46: 63 */           a(paramaqu, paramdt, paramamj);
/*  47: 64 */           this.a.a(paramaqu, paramdt, localbec2, paramahd, paramamj);
/*  48:    */         }
/*  49: 66 */         paramaqu.a(paramdt.n() + 0.5F, paramdt.o() + 0.5F, paramdt.p() + 0.5F, this.a.H.b(), (this.a.H.d() + 1.0F) / 2.0F, this.a.H.e() * 0.8F);
/*  50: 67 */         paramamj.b -= 1;
/*  51:    */       }
/*  52: 69 */       return true;
/*  53:    */     }
/*  54: 71 */     return false;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public static boolean a(aqu paramaqu, dt paramdt, amj paramamj)
/*  58:    */   {
/*  59: 75 */     if ((paramamj.n()) && (paramamj.o().b("BlockEntityTag", 10)))
/*  60:    */     {
/*  61: 76 */       bcm localbcm = paramaqu.s(paramdt);
/*  62: 77 */       if (localbcm != null)
/*  63:    */       {
/*  64: 78 */         fn localfn1 = new fn();
/*  65: 79 */         fn localfn2 = (fn)localfn1.b();
/*  66: 80 */         localbcm.b(localfn1);
/*  67:    */         
/*  68: 82 */         fn localfn3 = (fn)paramamj.o().a("BlockEntityTag");
/*  69: 83 */         localfn1.a(localfn3);
/*  70: 84 */         localfn1.a("x", paramdt.n());
/*  71: 85 */         localfn1.a("y", paramdt.o());
/*  72: 86 */         localfn1.a("z", paramdt.p());
/*  73: 88 */         if (!localfn1.equals(localfn2))
/*  74:    */         {
/*  75: 89 */           localbcm.a(localfn1);
/*  76: 90 */           localbcm.o_();
/*  77: 91 */           return true;
/*  78:    */         }
/*  79:    */       }
/*  80:    */     }
/*  81: 95 */     return false;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public boolean a(aqu paramaqu, dt paramdt, ej paramej, ahd paramahd, amj paramamj)
/*  85:    */   {
/*  86: 99 */     atr localatr = paramaqu.p(paramdt).c();
/*  87:100 */     if (localatr == aty.aH) {
/*  88:101 */       paramej = ej.b;
/*  89:102 */     } else if (!localatr.f(paramaqu, paramdt)) {
/*  90:103 */       paramdt = paramdt.a(paramej);
/*  91:    */     }
/*  92:106 */     return paramaqu.a(this.a, paramdt, false, paramej, null, paramamj);
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String e_(amj paramamj)
/*  96:    */   {
/*  97:111 */     return this.a.a();
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String a()
/* 101:    */   {
/* 102:116 */     return this.a.a();
/* 103:    */   }
/* 104:    */   
/* 105:    */   public akf c()
/* 106:    */   {
/* 107:121 */     return this.a.K();
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void a(alq paramalq, akf paramakf, List paramList)
/* 111:    */   {
/* 112:126 */     this.a.a(paramalq, paramakf, paramList);
/* 113:    */   }
/* 114:    */   
/* 115:    */   public atr d()
/* 116:    */   {
/* 117:130 */     return this.a;
/* 118:    */   }
/* 119:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aju
 * JD-Core Version:    0.7.0.1
 */