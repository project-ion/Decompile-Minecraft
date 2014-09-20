/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.ArrayList;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.Random;
/*   5:    */ 
/*   6:    */ public class adm
/*   7:    */   extends adj
/*   8:    */ {
/*   9:    */   public adn c;
/*  10:    */   
/*  11:    */   public adm(aqu paramaqu)
/*  12:    */   {
/*  13: 68 */     super(paramaqu);
/*  14:    */   }
/*  15:    */   
/*  16:    */   public adm(aqu paramaqu, dt paramdt, ej paramej)
/*  17:    */   {
/*  18: 72 */     super(paramaqu, paramdt);
/*  19:    */     
/*  20: 74 */     ArrayList localArrayList = Lists.newArrayList();
/*  21: 75 */     for (adn localadn : adn.values())
/*  22:    */     {
/*  23: 76 */       this.c = localadn;
/*  24: 77 */       a(paramej);
/*  25: 78 */       if (j()) {
/*  26: 79 */         localArrayList.add(localadn);
/*  27:    */       }
/*  28:    */     }
/*  29: 82 */     if (!localArrayList.isEmpty()) {
/*  30: 83 */       this.c = ((adn)localArrayList.get(this.V.nextInt(localArrayList.size())));
/*  31:    */     }
/*  32: 85 */     a(paramej);
/*  33:    */   }
/*  34:    */   
/*  35:    */   public adm(aqu paramaqu, dt paramdt, ej paramej, String paramString)
/*  36:    */   {
/*  37: 89 */     this(paramaqu, paramdt, paramej);
/*  38: 91 */     for (adn localadn : adn.values()) {
/*  39: 92 */       if (localadn.B.equals(paramString))
/*  40:    */       {
/*  41: 93 */         this.c = localadn;
/*  42: 94 */         break;
/*  43:    */       }
/*  44:    */     }
/*  45: 97 */     a(paramej);
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void b(fn paramfn)
/*  49:    */   {
/*  50:102 */     paramfn.a("Motive", this.c.B);
/*  51:103 */     super.b(paramfn);
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void a(fn paramfn)
/*  55:    */   {
/*  56:108 */     String str = paramfn.j("Motive");
/*  57:109 */     for (adn localadn : adn.values()) {
/*  58:110 */       if (localadn.B.equals(str)) {
/*  59:111 */         this.c = localadn;
/*  60:    */       }
/*  61:    */     }
/*  62:114 */     if (this.c == null) {
/*  63:115 */       this.c = adn.a;
/*  64:    */     }
/*  65:117 */     super.a(paramfn);
/*  66:    */   }
/*  67:    */   
/*  68:    */   public int l()
/*  69:    */   {
/*  70:122 */     return this.c.C;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public int m()
/*  74:    */   {
/*  75:127 */     return this.c.D;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void b(wv paramwv)
/*  79:    */   {
/*  80:132 */     if (!this.o.Q().b("doTileDrops")) {
/*  81:133 */       return;
/*  82:    */     }
/*  83:136 */     if ((paramwv instanceof ahd))
/*  84:    */     {
/*  85:137 */       ahd localahd = (ahd)paramwv;
/*  86:139 */       if (localahd.by.d) {
/*  87:140 */         return;
/*  88:    */       }
/*  89:    */     }
/*  90:144 */     a(new amj(amk.an), 0.0F);
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void b(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  94:    */   {
/*  95:149 */     dt localdt1 = new dt(paramDouble1 - this.s, paramDouble2 - this.t, paramDouble3 - this.u);
/*  96:150 */     dt localdt2 = this.a.a(localdt1);
/*  97:151 */     b(localdt2.n(), localdt2.o(), localdt2.p());
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean)
/* 101:    */   {
/* 102:156 */     dt localdt1 = new dt(paramDouble1 - this.s, paramDouble2 - this.t, paramDouble3 - this.u);
/* 103:157 */     dt localdt2 = this.a.a(localdt1);
/* 104:158 */     b(localdt2.n(), localdt2.o(), localdt2.p());
/* 105:    */   }
/* 106:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     adm
 * JD-Core Version:    0.7.0.1
 */